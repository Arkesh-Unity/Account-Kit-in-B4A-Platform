package com.mak.myaccountdemo;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,34);
if (RapidSub.canDelegate("activity_create")) { return com.mak.myaccountdemo.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 34;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(2);
 BA.debugLineNum = 36;BA.debugLine="Activity.LoadLayout(\"Layout1\")";
Debug.ShouldStop(8);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Layout1")),main.mostCurrent.activityBA);
 BA.debugLineNum = 37;BA.debugLine="account.initAccount";
Debug.ShouldStop(16);
main.mostCurrent._account.runVoidMethod ("initAccount",main.processBA);
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button3_click() throws Exception{
try {
		Debug.PushSubsStack("Button3_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,69);
if (RapidSub.canDelegate("button3_click")) { return com.mak.myaccountdemo.main.remoteMe.runUserSub(false, "main","button3_click");}
 BA.debugLineNum = 69;BA.debugLine="Sub Button3_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="Log(\"IDToken buttin clicked \")";
Debug.ShouldStop(32);
main.mostCurrent.__c.runVoidMethod ("LogImpl","0851969",RemoteObject.createImmutable("IDToken buttin clicked "),0);
 BA.debugLineNum = 71;BA.debugLine="account.startSignIn";
Debug.ShouldStop(64);
main.mostCurrent._account.runVoidMethod ("startSignIn",main.processBA);
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button4_click() throws Exception{
try {
		Debug.PushSubsStack("Button4_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,64);
if (RapidSub.canDelegate("button4_click")) { return com.mak.myaccountdemo.main.remoteMe.runUserSub(false, "main","button4_click");}
 BA.debugLineNum = 64;BA.debugLine="Sub Button4_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 65;BA.debugLine="Log(\"Auth ID buttin clicked\")";
Debug.ShouldStop(1);
main.mostCurrent.__c.runVoidMethod ("LogImpl","0786433",RemoteObject.createImmutable("Auth ID buttin clicked"),0);
 BA.debugLineNum = 66;BA.debugLine="account.startAuthSignIn";
Debug.ShouldStop(2);
main.mostCurrent._account.runVoidMethod ("startAuthSignIn",main.processBA);
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button5_click() throws Exception{
try {
		Debug.PushSubsStack("Button5_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,56);
if (RapidSub.canDelegate("button5_click")) { return com.mak.myaccountdemo.main.remoteMe.runUserSub(false, "main","button5_click");}
 BA.debugLineNum = 56;BA.debugLine="Sub Button5_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="Log(\"Signout buttin clicked  \")";
Debug.ShouldStop(16777216);
main.mostCurrent.__c.runVoidMethod ("LogImpl","0720897",RemoteObject.createImmutable("Signout buttin clicked  "),0);
 BA.debugLineNum = 58;BA.debugLine="account.startSignOut";
Debug.ShouldStop(33554432);
main.mostCurrent._account.runVoidMethod ("startSignOut",main.processBA);
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 30;BA.debugLine="Dim account As Account";
main.mostCurrent._account = RemoteObject.createNew ("b4x.account.demo.Account");
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _listener_authtoken(RemoteObject _token) throws Exception{
try {
		Debug.PushSubsStack("Listener_AuthToken (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,49);
if (RapidSub.canDelegate("listener_authtoken")) { return com.mak.myaccountdemo.main.remoteMe.runUserSub(false, "main","listener_authtoken", _token);}
Debug.locals.put("token", _token);
 BA.debugLineNum = 49;BA.debugLine="Sub Listener_AuthToken (token As String)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="Log(token)";
Debug.ShouldStop(131072);
main.mostCurrent.__c.runVoidMethod ("LogImpl","0589825",_token,0);
 BA.debugLineNum = 51;BA.debugLine="ToastMessageShow(token, False)";
Debug.ShouldStop(262144);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(_token)),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listener_idtoken(RemoteObject _token) throws Exception{
try {
		Debug.PushSubsStack("Listener_IdToken (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,44);
if (RapidSub.canDelegate("listener_idtoken")) { return com.mak.myaccountdemo.main.remoteMe.runUserSub(false, "main","listener_idtoken", _token);}
Debug.locals.put("token", _token);
 BA.debugLineNum = 44;BA.debugLine="Sub Listener_IdToken (token As String)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="Log(token)";
Debug.ShouldStop(4096);
main.mostCurrent.__c.runVoidMethod ("LogImpl","0524289",_token,0);
 BA.debugLineNum = 46;BA.debugLine="ToastMessageShow(token, False)";
Debug.ShouldStop(8192);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(_token)),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("com.mak.myaccountdemo.main");
starter.myClass = BA.getDeviceClass ("com.mak.myaccountdemo.starter");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}