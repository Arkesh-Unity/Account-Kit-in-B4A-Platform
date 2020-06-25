package b4x.account.demo;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BA.*;
import b4x.account.demo.AccountWork;
import b4x.account.demo.AccountAuthWork;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.support.hwid.HuaweiIdAuthManager;
import com.huawei.hms.support.hwid.request.HuaweiIdAuthParams;
import com.huawei.hms.support.hwid.request.HuaweiIdAuthParamsHelper;
import com.huawei.hms.support.hwid.result.AuthHuaweiId;
import com.huawei.hms.support.hwid.service.HuaweiIdAuthService;
import android.content.Intent;
import anywheresoftware.b4a.IOnActivityResult;
import android.util.Log;


import com.huawei.hms.support.hwid.service.HuaweiIdAuthService;

@Version(1.0f)
@ShortName("Account")
@DependsOn(values={"base-4.0.1.300.aar","agconnect-core-1.0.1.300.aar","opendevice-4.0.1.300.aar","tasks-1.3.1.302.aar","network-common-4.0.2.301.aar","network-grs-4.0.2.301.aar","hwid-4.0.1.300.aar"})
public class Account  {
	public static BA ba;
	public static final String TAG = "Account_Kit";


    public static void startSignIn(BA ba) {
		AccountWork.ListenForIdToken(ba.context);
    }
	
	
	public static void startAuthSignIn(BA ba) {
		AccountAuthWork.ListenForAuthToken(ba.context);
	}
	
	public static void startSignOut(BA ba) {
		AccountWork.signOut(ba.context);
		AccountAuthWork.signOut(ba.context);
	}
	

	public static void initAccount(BA xba) {
		ba = xba;
    }
	
	
}