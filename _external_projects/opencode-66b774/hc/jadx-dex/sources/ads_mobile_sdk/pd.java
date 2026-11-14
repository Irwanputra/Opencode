package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class pd extends ads_mobile_sdk.cu0 {
    public static final int A = 29;
    public static final int A0 = 96;
    public static final int B = 31;
    public static final int B0 = 82;
    public static final int C = 32;
    public static final int C0 = 83;
    public static final int D = 33;
    public static final int D0 = 84;
    private static final ads_mobile_sdk.pd DEFAULT_INSTANCE;
    public static final int E = 34;
    public static final int E0 = 85;
    public static final int F = 35;
    public static final int F0 = 86;
    public static final int G = 36;
    public static final int G0 = 87;
    public static final int H = 37;
    public static final int H0 = 97;
    public static final int I = 38;
    public static final int I0 = 88;
    public static final int J = 39;
    public static final int J0 = 89;
    public static final int K = 40;
    public static final int K0 = 103;
    public static final int L = 41;
    public static final int L0 = 90;
    public static final int M = 42;
    public static final int M0 = 91;
    public static final int N = 44;
    public static final int N0 = 92;
    public static final int O = 45;
    public static final int O0 = 93;
    public static final int P = 46;
    public static final int P0 = 94;
    public static final int Q = 47;
    public static final int Q0 = 98;
    public static final int R = 74;
    public static final int R0 = 99;
    public static final int S = 48;
    public static final int S0 = 100;
    public static final int T = 49;
    public static final int T0 = 101;
    public static final int U = 51;
    public static final int U0 = 102;
    public static final int V = 52;
    public static final int V0 = 104;
    public static final int W = 53;
    public static final int W0 = 105;
    public static final int X = 54;
    public static final int X0 = 21;
    public static final int Y = 55;
    public static final int Y0 = 24;
    public static final int Z = 56;
    public static final int Z0 = 26;
    public static final int a0 = 50;
    public static final int a1 = 28;
    public static final int b0 = 43;
    public static final int b1 = 30;
    public static final int c = 1;
    public static final int c0 = 57;
    public static final int c1 = 25;
    public static final int d = 2;
    public static final int d0 = 58;
    public static final int d1 = 201;
    public static final int e = 3;
    public static final int e0 = 59;
    public static final int e1 = 301;
    public static final int f = 4;
    public static final int f0 = 60;
    public static final int f1 = 302;
    public static final int g = 5;
    public static final int g0 = 61;
    public static final int g1 = 106;
    public static final int h = 6;
    public static final int h0 = 71;
    public static final int h1 = 107;
    public static final int i = 7;
    public static final int i0 = 72;
    public static final int i1 = 108;
    public static final int j = 8;
    public static final int j0 = 62;
    public static final int j1 = 109;
    public static final int k = 9;
    public static final int k0 = 63;
    public static final int k1 = 110;
    public static final int l = 10;
    public static final int l0 = 67;
    public static final int l1 = 111;
    public static final int m = 11;
    public static final int m0 = 64;
    public static final int n = 12;
    public static final int n0 = 65;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f89o = 13;
    public static final int o0 = 66;
    public static final int p = 14;
    public static final int p0 = 95;
    public static final int q = 15;
    public static final int q0 = 68;
    public static final int r = 16;
    public static final int r0 = 69;
    public static final int s = 17;
    public static final int s0 = 70;
    public static final int t = 18;
    public static final int t0 = 73;
    public static final int u = 19;
    public static final int u0 = 76;
    public static final int v = 20;
    public static final int v0 = 77;
    public static final int w = 22;
    public static final int w0 = 78;
    public static final int x = 23;
    public static final int x0 = 79;
    public static final int y = 27;
    public static final int y0 = 80;
    public static final int z = 75;
    public static final int z0 = 81;
    private long actSignal_;
    private dev.epro.r0.R17185427375111049466 activeExperimentIds_;
    private long activityIntentSignal_;
    private java.lang.String activityNameSignal_;
    private long activityStackSizeSignal_;
    private long acxSignal_;
    private long acySignal_;
    private long aczSignal_;
    private ads_mobile_sdk.rd adAttestationSignal_;
    private long adeventToVpnOffMs_;
    private java.lang.String adshieldVersion_;
    private long attSignal_;
    private long attitudeSignal_;
    private long atvSignal_;
    private long batteryTemperatureSignal_;
    private int bitField0_;
    private int bitField1_;
    private int bitField2_;
    private int bitField3_;
    private long bootCountSignal_;
    private long btlSignal_;
    private long btsSignal_;
    private long clsSignal_;
    private int debuggerStateSignal_;
    private java.lang.String deviceModelSignal_;
    private boolean didOptOut_;
    private java.lang.String didSignalAndroidAdId_;
    private int didSignalType_;
    private java.lang.String didSignal_;
    private int encryptionMethod_;
    private long evtTime_;
    private long experimentalInt64Signal_;
    private java.lang.String experimentalStringSignal_;
    private int fallbackSignalsType_;
    private dev.epro.r0.O6641393078261985068 functionDenylistSignal_;
    private long gmscoreVersionSignal_;
    private ads_mobile_sdk.tc hwInfo_;
    private long impressionDurationHighAttentionMs_;
    private long impressionDurationMs_;
    private ads_mobile_sdk.vc inputEvent_;
    private boolean iomSignal_;
    private int iosomSignal_;
    private int isLauncherSignal_;
    private long jbkSignal_;
    private ads_mobile_sdk.xc keyEvent_;
    private long keyId_;
    private long lastKnownDeviceTrustworthiness_;
    private long lastKnownHumannessScore_;
    private long lastKnownTrustDecisionLabel_;
    private int launcherActivityEnabled_;
    private java.lang.String lccSignal_;
    private java.lang.String llcSignal_;
    private int mpSignal_;
    private int navigationTriggerType_;
    private long netSignal_;
    private int niSignal_;
    private long ornSignal_;
    private long pkgNameDetailSignal_;
    private long pmSignal_;
    private dev.epro.r0.O6641393078261985068 previousTouches_;
    private long processImportanceSignal_;
    private int protoName_;
    private int proxyDetectedSignal_;
    private long psnSignal_;
    private long ratSignal_;
    private ads_mobile_sdk.he rawAdAttestationSignal_;
    private long recentForegroundTimeSignal_;
    private long reqType_;
    private ads_mobile_sdk.je requestData_;
    private dev.epro.r0.O6641393078261985068 resetCounters_;
    private java.lang.String sccSignal_;
    private ads_mobile_sdk.id screenInfo_;
    private long screenStateSignal_;
    private java.lang.String sftnIdSignal_;
    private ads_mobile_sdk.kd soundInfoSignal_;
    private long swzSignal_;
    private long tctSignal_;
    private long tcxSignal_;
    private long tcySignal_;
    private long timeSinceVpnOnMs_;
    private long totalForegroundTimeSignal_;
    private ads_mobile_sdk.md touch_;
    private long uhSignal_;
    private long uptSignal_;
    private long usgSignal_;
    private long utzSignal_;
    private long uwSignal_;
    private long vcdSignal_;
    private long virtualIntegrityType_;
    private long visSignal_;
    private ads_mobile_sdk.od visibilitySignal_;
    private int vpnSignal_;
    private int activeExperimentIdsMemoizedSerializedSize = -1;
    private java.lang.String osVersion_ = "";
    private java.lang.String afmaVersion_ = "";
    private java.lang.String stkSignal_ = "";
    private java.lang.String intSignal_ = "";
    private java.lang.String midSignal_ = "D";
    private java.lang.String cerSignal_ = "";
    private java.lang.String vnmSignal_ = "";
    private long tcpSignal_ = -1;
    private long tcdSignal_ = -1;
    private long tcuSignal_ = -1;
    private long tcmSignal_ = -1;
    private long tcdnSignal_ = -1;
    private long tccSignal_ = -1;
    private long cpuSignal_ = -1;
    private long stkDepthSignal_ = -1;
    private java.lang.String appIdSignal_ = "D";
    private java.lang.String installerSignal_ = "D";
    private long timeSinceInstallMinutes_ = -1;
    private int usbConnectedSignal_ = 1000;
    private int adbEnabledSignal_ = 1000;
    private long deviceElapsedRealTimeSignal_ = -1;
    private long deviceUptimeSignal_ = -1;
    private long timeOnScreenMs_ = -1;
    private long percentAdOnScreen_ = -1;
    private long percentScreenCoveredByAd_ = -1;
    private int isNativeViewPerformclickMissing_ = 1000;

    static {
        ads_mobile_sdk.pd pdVar = new ads_mobile_sdk.pd();
        DEFAULT_INSTANCE = pdVar;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.pd.class, pdVar);
    }

    public pd() {
        ads_mobile_sdk.in2 in2Var = ads_mobile_sdk.in2.e;
        this.previousTouches_ = in2Var;
        this.gmscoreVersionSignal_ = -1L;
        this.batteryTemperatureSignal_ = -1L;
        this.processImportanceSignal_ = -1L;
        this.screenStateSignal_ = -1L;
        this.recentForegroundTimeSignal_ = -1L;
        this.totalForegroundTimeSignal_ = -1L;
        this.activityIntentSignal_ = -1L;
        this.activityStackSizeSignal_ = -1L;
        this.activityNameSignal_ = "D";
        this.pkgNameDetailSignal_ = -1L;
        this.attitudeSignal_ = -1L;
        this.proxyDetectedSignal_ = 1000;
        this.launcherActivityEnabled_ = 1000;
        this.sftnIdSignal_ = "D";
        this.resetCounters_ = in2Var;
        this.vpnSignal_ = 1000;
        this.functionDenylistSignal_ = in2Var;
        this.deviceModelSignal_ = "";
        this.timeSinceVpnOnMs_ = -1L;
        this.adeventToVpnOffMs_ = -1L;
        this.impressionDurationMs_ = -1L;
        this.impressionDurationHighAttentionMs_ = -1L;
        this.virtualIntegrityType_ = -1L;
        this.adshieldVersion_ = "";
        this.lastKnownTrustDecisionLabel_ = -1L;
        this.bootCountSignal_ = -1L;
        this.lccSignal_ = "";
        this.llcSignal_ = "";
        this.ratSignal_ = -1L;
        this.pmSignal_ = -1L;
        this.didSignal_ = "";
        this.didSignalType_ = 2;
        this.didSignalAndroidAdId_ = "";
        this.experimentalInt64Signal_ = -1L;
        this.experimentalStringSignal_ = "";
        this.activeExperimentIds_ = ads_mobile_sdk.jb1.e;
        this.clsSignal_ = -1L;
        this.isLauncherSignal_ = 1000;
        this.iosomSignal_ = 1000;
        this.sccSignal_ = "";
    }

    public static dev.epro.r0.V5431423861497278836 w() {
        return DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i2, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i2);
        if (iE == 2) {
            ads_mobile_sdk.ad adVar = ads_mobile_sdk.ad.a$24;
            ads_mobile_sdk.ad adVar2 = ads_mobile_sdk.ad.a$2;
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0001r\u0000\u0004\u0001Įr\u0000\u0004\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ`\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈa\u0019ဂe\u001a᠌b\u001bဈ\u0016\u001cဇc\u001dဈ\u0018\u001eဈd\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0᠌*1᠌+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08᠌19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=A᠌>B᠌?Cဈ<D᠌AEဉBFဂCGဂ8Hဂ9I᠌DJဂ)Kဈ\u0017L᠌EMဈFN\u001bO᠌GP\u001bQဉHRဈJSဂKTဂLUဂMVဂNWဂOXဂQYဈRZဉT[ဉU\\ဂV]ဂW^᠌X_᠌@`ဉIaဂPbဈYcဈZdဂ[eဂ\\f᠌]gဂShဉ^iဇ_j'kဂil᠌jm᠌kn᠌loဈmÉဉfĭဂgĮဈh", new java.lang.Object[]{"bitField0_", "bitField1_", "bitField2_", "bitField3_", "osVersion_", "afmaVersion_", "atvSignal_", "attSignal_", "btsSignal_", "btlSignal_", "acxSignal_", "acySignal_", "aczSignal_", "actSignal_", "netSignal_", "ornSignal_", "stkSignal_", "tcxSignal_", "tcySignal_", "tctSignal_", "uptSignal_", "visSignal_", "swzSignal_", "psnSignal_", "reqType_", "jbkSignal_", "usgSignal_", "didSignal_", "evtTime_", "didSignalType_", adVar, "intSignal_", "didOptOut_", "cerSignal_", "didSignalAndroidAdId_", "uwSignal_", "uhSignal_", "utzSignal_", "vnmSignal_", "vcdSignal_", "tcpSignal_", "tcdSignal_", "adAttestationSignal_", "tcuSignal_", "tcmSignal_", "tcdnSignal_", "tccSignal_", "previousTouches_", ads_mobile_sdk.md.class, "cpuSignal_", "stkDepthSignal_", "appIdSignal_", "installerSignal_", "usbConnectedSignal_", adVar2, "adbEnabledSignal_", adVar2, "touch_", "deviceElapsedRealTimeSignal_", "deviceUptimeSignal_", "timeOnScreenMs_", "percentAdOnScreen_", "percentScreenCoveredByAd_", "isNativeViewPerformclickMissing_", adVar2, "visibilitySignal_", "gmscoreVersionSignal_", "batteryTemperatureSignal_", "processImportanceSignal_", "screenStateSignal_", "activityIntentSignal_", "activityStackSizeSignal_", "pkgNameDetailSignal_", "encryptionMethod_", ads_mobile_sdk.tt.a$10, "protoName_", ads_mobile_sdk.ad.a$9, "activityNameSignal_", "debuggerStateSignal_", ads_mobile_sdk.ad.a$18, "requestData_", "attitudeSignal_", "recentForegroundTimeSignal_", "totalForegroundTimeSignal_", "proxyDetectedSignal_", adVar2, "timeSinceInstallMinutes_", "midSignal_", "launcherActivityEnabled_", adVar2, "sftnIdSignal_", "resetCounters_", ads_mobile_sdk.gd.class, "vpnSignal_", adVar2, "functionDenylistSignal_", ads_mobile_sdk.lc.class, "soundInfoSignal_", "deviceModelSignal_", "timeSinceVpnOnMs_", "adeventToVpnOffMs_", "impressionDurationMs_", "impressionDurationHighAttentionMs_", "lastKnownDeviceTrustworthiness_", "virtualIntegrityType_", "adshieldVersion_", "inputEvent_", "keyEvent_", "lastKnownTrustDecisionLabel_", "bootCountSignal_", "navigationTriggerType_", ads_mobile_sdk.ad.a, "fallbackSignalsType_", ads_mobile_sdk.ad.a$27, "screenInfo_", "lastKnownHumannessScore_", "lccSignal_", "llcSignal_", "ratSignal_", "pmSignal_", "niSignal_", ads_mobile_sdk.ad.a$5, "keyId_", "hwInfo_", "iomSignal_", "activeExperimentIds_", "clsSignal_", "isLauncherSignal_", adVar2, "iosomSignal_", adVar2, "mpSignal_", ads_mobile_sdk.tt.a$9, "sccSignal_", "rawAdAttestationSignal_", "experimentalInt64Signal_", "experimentalStringSignal_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.pd();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.V5431423861497278836(DEFAULT_INSTANCE);
    }

    public final void b(java.lang.String str) {
        java.util.Objects.requireNonNull(str);
        this.bitField1_ |= 268435456;
        this.activityNameSignal_ = str;
    }

    public final void c(java.lang.String str) {
        java.util.Objects.requireNonNull(str);
        this.bitField2_ |= 262144;
        this.adshieldVersion_ = str;
    }

    public final void d(java.lang.String str) {
        java.util.Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.afmaVersion_ = str;
    }

    public final void e(java.lang.String str) {
        java.util.Objects.requireNonNull(str);
        this.bitField1_ |= 128;
        this.appIdSignal_ = str;
    }

    public final void f(java.lang.String str) {
        java.util.Objects.requireNonNull(str);
        this.bitField0_ |= 16777216;
        this.cerSignal_ = str;
    }

    public final void g(java.lang.String str) {
        java.util.Objects.requireNonNull(str);
        this.bitField2_ |= 1024;
        this.deviceModelSignal_ = str;
    }

    public final void h(java.lang.String str) {
        java.util.Objects.requireNonNull(str);
        this.bitField1_ |= 256;
        this.installerSignal_ = str;
    }

    public final void i(java.lang.String str) {
        java.util.Objects.requireNonNull(str);
        this.bitField0_ |= 4194304;
        this.intSignal_ = str;
    }

    public final void j(java.lang.String str) {
        java.util.Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.osVersion_ = str;
    }

    public final void k(java.lang.String str) {
        java.util.Objects.requireNonNull(str);
        this.bitField0_ |= 268435456;
        this.vnmSignal_ = str;
    }

    public final ads_mobile_sdk.he r() {
        ads_mobile_sdk.he heVar = this.rawAdAttestationSignal_;
        return heVar == null ? ads_mobile_sdk.he.DEFAULT_INSTANCE : heVar;
    }

    public final boolean t() {
        return (this.bitField1_ & 1048576) != 0;
    }

    public final boolean u() {
        return (this.bitField0_ & 524288) != 0;
    }

    public final boolean v() {
        return (this.bitField3_ & 64) != 0;
    }

    public final long o() {
        return this.gmscoreVersionSignal_;
    }

    public final java.lang.String p() {
        return this.intSignal_;
    }

    public final long q() {
        return this.psnSignal_;
    }

    public final long s() {
        return this.recentForegroundTimeSignal_;
    }

    public final void b(ads_mobile_sdk.md mdVar) {
        this.touch_ = mdVar;
        this.bitField1_ |= 262144;
    }

    public final void a(ads_mobile_sdk.md mdVar) {
        dev.epro.r0.O6641393078261985068 o6641393078261985068B = this.previousTouches_;
        if (!((ads_mobile_sdk.j) o6641393078261985068B).a) {
            o6641393078261985068B = dev.epro.r0.T8598786036980488824.b(o6641393078261985068B);
            this.previousTouches_ = o6641393078261985068B;
        }
        o6641393078261985068B.add(mdVar);
    }

    public final void a(ads_mobile_sdk.vc vcVar) {
        this.inputEvent_ = vcVar;
        this.bitField2_ |= 1048576;
    }

    public final void a(ads_mobile_sdk.he heVar) {
        java.util.Objects.requireNonNull(heVar);
        this.rawAdAttestationSignal_ = heVar;
        this.bitField3_ |= 64;
    }

    public final void a(ads_mobile_sdk.od odVar) {
        this.visibilitySignal_ = odVar;
        this.bitField1_ |= 524288;
    }

    public static ads_mobile_sdk.pd a(byte[] bArr, ads_mobile_sdk.nl0 nl0Var) throws ads_mobile_sdk.yi1 {
        ads_mobile_sdk.cu0 cu0VarA = ads_mobile_sdk.cu0.a(DEFAULT_INSTANCE, bArr, bArr.length, nl0Var);
        ads_mobile_sdk.cu0.a(cu0VarA);
        return (ads_mobile_sdk.pd) cu0VarA;
    }
}
