package b4x.account.demo;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BA.*;
import android.content.Context;
import android.util.Log;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.agconnect.config.LazyInputStream;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;;
import com.huawei.hmf.tasks.OnCompleteListener;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.support.hwid.HuaweiIdAuthManager;
import com.huawei.hms.support.hwid.request.HuaweiIdAuthParams;
import com.huawei.hms.support.hwid.request.HuaweiIdAuthParamsHelper;
import com.huawei.hms.support.hwid.result.AuthHuaweiId;
import com.huawei.hms.support.hwid.service.HuaweiIdAuthService;
import android.content.Intent;
import anywheresoftware.b4a.IOnActivityResult;


import java.io.IOException;
import java.io.InputStream;
import static b4x.account.demo.Account.ba;

@ShortName("AccountAuthWork")
@Events(values={"AuthToken (token As String)"})
public class AccountAuthWork {
	public static String eventName = "listener";
	public static final String TAG = "Account_Kit";
	private static HuaweiIdAuthService service = null;
	
	public static void init (Context context){
        AGConnectServicesConfig.fromContext(context).overlayWith(new LazyInputStream(context) {
            @Override
            public InputStream get(Context context) {
                try {
                    return context.getAssets().open("agconnect-services.json");
                } catch (IOException e) {
                    e.printStackTrace();
                     BA.Log(e.toString());
                }
                return null;
            }
        });
    }
	
	private static IOnActivityResult ion;
       	
		public static void ListenForAuthToken(final Context context) {
            
            ion = new IOnActivityResult() {

                @SuppressWarnings("unchecked")
                @Override
                public void ResultArrived(int resultCode, Intent data) {
                    Task<AuthHuaweiId> authHuaweiIdTask = HuaweiIdAuthManager.parseAuthResultFromIntent(data);
					if (authHuaweiIdTask.isSuccessful()) {
						//The sign-in is successful, and the user's HUAWEI ID information and ID token are obtained.
						AuthHuaweiId huaweiAccount = authHuaweiIdTask.getResult();
						String s = huaweiAccount.getAuthorizationCode();
						
						Log.i(TAG, "idToken:" + s);
						Log.i(TAG, huaweiAccount.getDisplayName() + " signIn success ");
						ba.raiseEventFromUI(this, eventName + "_authtoken", s);
					} else {
						//The sign-in failed.
						Log.e(TAG, "sign in failed : " +((ApiException)authHuaweiIdTask.getException()).getStatusCode());
					}
                   // ba.raiseEvent(VoiceRecognition.this, eventName + "_result", list.IsInitialized(), list);

                }
            };
			HuaweiIdAuthParams authParams = new HuaweiIdAuthParamsHelper(HuaweiIdAuthParams.DEFAULT_AUTH_REQUEST_PARAM).setAuthorizationCode().createParams();
			HuaweiIdAuthService service= HuaweiIdAuthManager.getService(context, authParams);
            ba.startActivityForResult(ion, service.getSignInIntent());
        }
		
		public static void signOut(final Context context) {
			if(service != null) {
				Task<Void> signOutTask = service.signOut();
				
				signOutTask.addOnSuccessListener(new OnSuccessListener<Void>() {
					@Override
					public void onSuccess(Void aVoid) {
						Log.i(TAG, "signOut Success");
					}
				}).addOnFailureListener(new OnFailureListener() {
					@Override
					public void onFailure(Exception e) {
						Log.i(TAG, "signOut fail");
					}
				}).addOnCompleteListener(new OnCompleteListener<Void>() {
					 @Override   
					 public void onComplete(Task<Void> task) {      
						// Processing after the sign-out.       
						Log.i(TAG, "signOut complete");
					}
				});
				
			}
		}
	
}