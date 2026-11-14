package com.pairip.licensecheck;

/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class LicenseClient implements android.content.ServiceConnection {
    private static final java.lang.String BACKGROUND_SERVICE_INTERFACE_CLASS_NAME = "com.android.vending.licensing.IBackgroundLicensingService";
    private static final int ERROR_INVALID_PACKAGE_NAME = 3;
    private static final int EVENTUAL_SHUTDOWN_DELAY_MILLIS = 30000;
    private static final java.lang.String EXTRA_END_CUSTOM_TRIAL = "end_custom_trial";
    private static final int FIRST_ISOLATED_UID = 99000;
    private static final int FLAG_RPC_CALL = 0;
    private static final int LAST_ISOLATED_UID = 99999;
    private static final int LICENSED = 0;
    private static final int MAX_RETRIES = 3;
    private static final int MILLIS_PER_SEC = 1000;
    private static final long MIN_TRIAL_END_INTERVAL_MILLIS = 3000;
    private static final int NOT_LICENSED = 2;
    private static final java.lang.String PAYLOAD_PAYWALL = "PAYWALL_INTENT";
    private static final int PER_USER_RANGE = 100000;
    private static final int REPEATED_CHECK_RETRY_DELAY_MILLIS = 300000;
    private static final int RETRY_DELAY_MILLIS = 2000;
    private static final java.lang.String SERVICE_INTERFACE_CLASS_NAME = "com.android.vending.licensing.ILicensingService";
    private static final java.lang.String SERVICE_PACKAGE = "com.android.vending";
    private static final java.lang.String TAG = "LicenseClient";
    private static final int TRANSACTION_CHECK_LICENSE_V2 = 2;
    private static final int TRANSACTION_REPORT_SUCCESSFUL_LICENSE_CHECK = 3;
    protected static boolean backgroundLicensingServiceEnabled = true;
    protected static boolean customTrialEndTriggered = false;
    protected static boolean eventualShutdownEnabled = true;
    public static boolean gracefulShutdownEnabled = true;
    private static final android.os.Handler handler;
    private static com.pairip.licensecheck.LicenseClient instance = null;
    protected static long lastTrialEndElapsedRealtimeMillis = 0;
    protected static java.lang.String licensePubKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxc7KD8LldJ8QfnkhWXDIb2jNESRHM5coyoFFoO0jbt3Mp7OVjbhU8fsmWATrVMFsGbq91dxOG/Crj7oD1mbt+C4FNRvxH+oXS2qnz4MPCbE6vV+QDO/1sgzM8LLBdPM8Rtmno50qON4ANmkkxuFnrnYtnySWfCGmd5HCkGE0jQrohxneMyDVMTh00diK+tnRAdBd5Tyx7HM2wgqiCWdhw16ryYt0ouA4Jpr2ZMML2txoRbYUXayiZyf7A70tTijJVpC/Z4bxnOjDYhnC3rCg7IsK/x4tmgStKw1Pnuh769KcHuB9zRETrzyko7UJ5+rm5ra6KTxjJqsNGRJN9HwIIQIDAQAB";
    protected static boolean localCheckEnabled = true;
    protected static com.pairip.licensecheck.LicenseClient.ImmediateTaskExecutor mainThreadRunner = null;
    protected static java.lang.String packageName = "xyz.easypro.httpcustom";
    protected static boolean repeatedCheckEnabled = true;
    protected static android.os.Bundle responsePayload;
    private final android.content.Context context;
    protected static java.lang.Runnable exitAction = new java.lang.Runnable() { // from class: com.pairip.licensecheck.LicenseClient.1
        @Override // java.lang.Runnable
        public void run() {
            java.lang.System.exit(0);
        }
    };
    protected static volatile com.pairip.licensecheck.LicenseClient.LicenseCheckState licenseCheckState = com.pairip.licensecheck.LicenseClient.LicenseCheckState.CHECK_REQUIRED;
    protected static com.pairip.licensecheck.LicenseClient.ImmediateTaskExecutor backgroundRunner = new com.pairip.licensecheck.LicenseClient.ImmediateTaskExecutor() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda5
        @Override // com.pairip.licensecheck.LicenseClient.ImmediateTaskExecutor
        public final void run(java.lang.Runnable runnable) {
            new java.lang.Thread(runnable).start();
        }
    };
    protected com.pairip.licensecheck.LicenseClient.DelayedTaskExecutor delayedTaskExecutor = new com.pairip.licensecheck.LicenseClient.DelayedTaskExecutorImpl();
    protected int retryNum = 0;
    protected boolean isBound = false;
    protected boolean waitingForRepeatedCheck = false;
    private long repeatedCheckStartElapsedRealtime = 0;

    public interface DelayedTaskExecutor {
        void schedule(java.lang.Runnable task, long delayMillis);
    }

    public interface ImmediateTaskExecutor {
        void run(java.lang.Runnable task);
    }

    public enum LicenseCheckState {
        CHECK_REQUIRED,
        FULL_CHECK_OK,
        LOCAL_CHECK_OK,
        LOCAL_CHECK_REPORTED,
        REPEATED_CHECK_REQUIRED
    }

    static {
        final android.os.Handler handler2 = new android.os.Handler(android.os.Looper.getMainLooper());
        handler = handler2;
        java.util.Objects.requireNonNull(handler2);
        mainThreadRunner = new com.pairip.licensecheck.LicenseClient.ImmediateTaskExecutor() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda6
            @Override // com.pairip.licensecheck.LicenseClient.ImmediateTaskExecutor
            public final void run(java.lang.Runnable runnable) {
                handler2.post(runnable);
            }
        };
        customTrialEndTriggered = false;
        lastTrialEndElapsedRealtimeMillis = 0L;
    }

    private static synchronized com.pairip.licensecheck.LicenseClient getInstance(android.content.Context context) {
        com.pairip.licensecheck.LicenseClient licenseClient;
        licenseClient = instance;
        if (licenseClient == null) {
            licenseClient = new com.pairip.licensecheck.LicenseClient(context);
            instance = licenseClient;
        }
        return licenseClient;
    }

    public static void checkLicense(final android.content.Context context) {
        if (context == null) {
            android.util.Log.w(TAG, "Cannot check license with null context.");
        } else if (isIsolatedProcess()) {
            android.util.Log.i(TAG, "Skipping license check in isolated process.");
        } else {
            mainThreadRunner.run(new java.lang.Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    com.pairip.licensecheck.LicenseClient.getInstance(context).initializeLicenseCheck();
                }
            });
        }
    }

    static void stopTrial(final android.content.Context context) {
        if (context == null) {
            android.util.Log.w(TAG, "Cannot trigger trial end with null context.");
        } else if (isIsolatedProcess()) {
            android.util.Log.i(TAG, "Skipping trial end in isolated process.");
        } else {
            mainThreadRunner.run(new java.lang.Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    com.pairip.licensecheck.LicenseClient.getInstance(context).handleTrialEnd();
                }
            });
        }
    }

    static com.pairip.licensecheck.TrialStatus checkTrialStatus() {
        if (isIsolatedProcess()) {
            android.util.Log.i(TAG, "Skipping trial status check in isolated process.");
            return com.pairip.licensecheck.TrialStatus.UNKNOWN;
        }
        int iOrdinal = licenseCheckState.ordinal();
        if (iOrdinal == 0) {
            return com.pairip.licensecheck.TrialStatus.UNKNOWN;
        }
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            return com.pairip.licensecheck.TrialStatus.NOT_UNDER_TRIAL;
        }
        if (iOrdinal != 4) {
            throw new java.lang.RuntimeException(null, null);
        }
        return com.pairip.licensecheck.TrialStatus.UNDER_TRIAL;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void handleTrialEnd() {
        long elapsedRealtimeMillis = getElapsedRealtimeMillis();
        long j = lastTrialEndElapsedRealtimeMillis;
        long j2 = elapsedRealtimeMillis - j;
        if (j <= 0 || j2 >= MIN_TRIAL_END_INTERVAL_MILLIS) {
            android.util.Log.i(TAG, "Trial end event triggered; initiating full license check.");
            lastTrialEndElapsedRealtimeMillis = elapsedRealtimeMillis;
            customTrialEndTriggered = true;
            licenseCheckState = com.pairip.licensecheck.LicenseClient.LicenseCheckState.CHECK_REQUIRED;
            this.waitingForRepeatedCheck = false;
            initiateFreshLicensingServiceConnection(false);
            return;
        }
        android.util.Log.w(TAG, java.lang.String.format("Trial end trigger throttled. Ignoring request (sent %d ms ago).", java.lang.Long.valueOf(j2)));
    }

    private static boolean isIsolatedProcess() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return android.os.Process.isIsolated();
        }
        int iMyUid = android.os.Process.myUid() % PER_USER_RANGE;
        return iMyUid >= FIRST_ISOLATED_UID && iMyUid <= LAST_ISOLATED_UID;
    }

    public static java.lang.String getLicensePubKey() {
        return licensePubKey;
    }

    public LicenseClient(android.content.Context context) {
        this.context = context;
    }

    public void initializeLicenseCheck() {
        int iOrdinal = licenseCheckState.ordinal();
        if (iOrdinal == 0) {
            if (localCheckEnabled && !customTrialEndTriggered) {
                backgroundRunner.run(new java.lang.Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda8
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.lambda$initializeLicenseCheck$0();
                    }
                });
                return;
            } else {
                initiateFreshLicensingServiceConnection(false);
                return;
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 4) {
                initiateFreshLicensingServiceConnection(false);
            }
        } else {
            try {
                com.pairip.licensecheck.LicenseResponseHelper.validateResponse(responsePayload, packageName);
            } catch (com.pairip.licensecheck.LicenseCheckException e) {
                handleError(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializeLicenseCheck$0() {
        final boolean zPerformLocalInstallerCheck = performLocalInstallerCheck();
        mainThreadRunner.run(new java.lang.Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$initializeLicenseCheck$1(zPerformLocalInstallerCheck);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ void lambda$initializeLicenseCheck$1(boolean r1) {
        /*
            r0 = this;
            if (r1 == 0) goto Lc
            com.pairip.licensecheck.LicenseClient$LicenseCheckState r1 = com.pairip.licensecheck.LicenseClient.LicenseCheckState.LOCAL_CHECK_OK
            com.pairip.licensecheck.LicenseClient.licenseCheckState = r1
            boolean r1 = com.pairip.licensecheck.LicenseClient.backgroundLicensingServiceEnabled
            if (r1 == 0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            r0.initiateFreshLicensingServiceConnection(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pairip.licensecheck.LicenseClient.lambda$initializeLicenseCheck$1(boolean):void");
    }

    private boolean performLocalInstallerCheck() {
        try {
            if (android.os.Build.VERSION.SDK_INT < 30) {
                android.util.Log.i(TAG, "Local install check bypassed due to old SDK version.");
                return false;
            }
            android.content.pm.PackageManager packageManager = this.context.getPackageManager();
            if (packageManager == null) {
                android.util.Log.i(TAG, "Local install check bypassed due to package manager not found.");
                return false;
            }
            android.content.pm.PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            if (packageInfo == null || packageInfo.applicationInfo == null) {
                android.util.Log.i(TAG, "Local install check bypassed due to app package info not found.");
                return false;
            }
            int i = packageInfo.applicationInfo.flags;
            if ((i & 1) != 0 || (i & 128) != 0) {
                android.util.Log.i(TAG, "Local install check passed due to system app.");
            } else {
                android.content.pm.InstallSourceInfo installSourceInfo = packageManager.getInstallSourceInfo(packageName);
                if (installSourceInfo == null) {
                    android.util.Log.i(TAG, "Local install check bypassed due to install source info not found.");
                    return false;
                }
                java.lang.String installingPackageName = installSourceInfo.getInstallingPackageName();
                if (installingPackageName == null || !installingPackageName.equals(SERVICE_PACKAGE)) {
                    android.util.Log.i(TAG, "Local install check failed due to wrong installer.");
                    return false;
                }
            }
            return true;
        } catch (java.lang.Exception e) {
            android.util.Log.w(TAG, "Could not obtain package info for local installer check.", e);
            return false;
        }
    }

    private void initiateFreshLicensingServiceConnection(boolean useBackgroundService) {
        this.retryNum = 0;
        lambda$retryOrThrow$1(useBackgroundService);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: bindToLicensingService, reason: merged with bridge method [inline-methods] */
    public void lambda$retryOrThrow$1(boolean useBackgroundService) {
        java.lang.String str;
        java.lang.String str2;
        unbindFromLicensingService();
        if (useBackgroundService) {
            str = "Connecting to the background licensing service...";
        } else {
            str = "Connecting to the main licensing service...";
        }
        android.util.Log.d(TAG, str);
        if (useBackgroundService) {
            str2 = BACKGROUND_SERVICE_INTERFACE_CLASS_NAME;
        } else {
            str2 = SERVICE_INTERFACE_CLASS_NAME;
        }
        android.content.Intent action = new android.content.Intent(str2).setPackage(SERVICE_PACKAGE).setAction(str2);
        boolean z = useBackgroundService || isLocalCheckPassed();
        try {
            if (!this.context.bindService(action, this, 1)) {
                retryOrThrow(new com.pairip.licensecheck.LicenseCheckException("Could not bind with the licensing service: ".concat(str2)), z, useBackgroundService);
            } else {
                this.isBound = true;
            }
        } catch (java.lang.SecurityException e) {
            retryOrThrow(new com.pairip.licensecheck.LicenseCheckException("Not allowed to bind with the licensing service: ".concat(str2), e), z, useBackgroundService);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, final android.os.IBinder licensingServiceBinder) {
        android.util.Log.d(TAG, "Connected to the licensing service.");
        int iOrdinal = licenseCheckState.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    backgroundRunner.run(new java.lang.Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda10
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.lambda$onServiceConnected$1(licensingServiceBinder);
                        }
                    });
                    return;
                } else if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        return;
                    }
                }
            }
            unbindFromLicensingService();
            return;
        }
        backgroundRunner.run(new java.lang.Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$onServiceConnected$0(licensingServiceBinder);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onServiceConnected$0(android.os.IBinder iBinder) {
        try {
            checkLicenseInternal(iBinder);
        } catch (android.os.RemoteException e) {
            handleError(new com.pairip.licensecheck.LicenseCheckException("Error when getting interface descriptor.", e));
        } catch (com.pairip.licensecheck.LicenseCheckException e2) {
            handleError(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onServiceConnected$1(android.os.IBinder iBinder) {
        try {
            reportSuccessfulLicenseCheck(iBinder);
        } catch (java.lang.Exception e) {
            android.util.Log.e(TAG, "Error while reporting license check: " + android.util.Log.getStackTraceString(e));
            mainThreadRunner.run(new com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda0(this));
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        boolean z = false;
        this.isBound = false;
        if (licenseCheckState.equals(com.pairip.licensecheck.LicenseClient.LicenseCheckState.REPEATED_CHECK_REQUIRED) && this.waitingForRepeatedCheck) {
            android.util.Log.d(TAG, "Ignoring service disconnection in REPEATED_CHECK_REQUIRED state.");
            return;
        }
        android.util.Log.w(TAG, "Unexpectedly disconnected from the licensing service.");
        boolean zIsLocalCheckPassed = isLocalCheckPassed();
        if (zIsLocalCheckPassed && backgroundLicensingServiceEnabled) {
            z = true;
        }
        retryOrThrow(new com.pairip.licensecheck.LicenseCheckException("Licensing service unexpectedly disconnected."), zIsLocalCheckPassed, z);
    }

    private void checkLicenseInternal(android.os.IBinder licensingServiceBinder) throws com.pairip.licensecheck.LicenseCheckException, android.os.RemoteException {
        if (licensingServiceBinder == null) {
            retryOrThrow(new com.pairip.licensecheck.LicenseCheckException("Received a null binder."));
            return;
        }
        if (licensingServiceBinder.getInterfaceDescriptor().equals(BACKGROUND_SERVICE_INTERFACE_CLASS_NAME)) {
            throw new com.pairip.licensecheck.LicenseCheckException("Background licensing service does not support full license check.");
        }
        android.util.Log.d(TAG, "Sending request to licensing service...");
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
        try {
            try {
                try {
                    populateInputDataForLicenseCheckV2(parcelObtain, licensingServiceBinder);
                    if (!licensingServiceBinder.transact(2, parcelObtain, parcelObtain2, 0)) {
                        handleError(new com.pairip.licensecheck.LicenseCheckException("Licensing service could not process request."));
                    }
                } catch (android.os.RemoteException e) {
                    handleError(new com.pairip.licensecheck.LicenseCheckException("Error when calling licensing service.", e));
                }
            } catch (android.os.DeadObjectException e2) {
                retryOrThrow(new com.pairip.licensecheck.LicenseCheckException("Licensing service process died.", e2));
            }
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
            android.util.Log.d(TAG, "Request to licensing service sent.");
        }
    }

    public void reportSuccessfulLicenseCheck(android.os.IBinder licensingServiceBinder) throws com.pairip.licensecheck.LicenseCheckException {
        com.pairip.licensecheck.LicenseClient.ImmediateTaskExecutor immediateTaskExecutor;
        com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda0 licenseClient$$ExternalSyntheticLambda0;
        if (licensingServiceBinder == null) {
            retryOrThrow(new com.pairip.licensecheck.LicenseCheckException("Received a null binder."), true, backgroundLicensingServiceEnabled);
            return;
        }
        android.util.Log.d(TAG, "Sending request to license reporting service...");
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
        try {
            try {
                populateInputDataForReportAutoVerifiedLicense(parcelObtain, licensingServiceBinder);
                if (licensingServiceBinder.transact(3, parcelObtain, parcelObtain2, 0)) {
                    mainThreadRunner.run(new java.lang.Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda12
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.pairip.licensecheck.LicenseClient.licenseCheckState = com.pairip.licensecheck.LicenseClient.LicenseCheckState.LOCAL_CHECK_REPORTED;
                        }
                    });
                } else {
                    android.util.Log.e(TAG, "Error sending request to license reporting service.");
                }
                parcelObtain.recycle();
                parcelObtain2.recycle();
                immediateTaskExecutor = mainThreadRunner;
                licenseClient$$ExternalSyntheticLambda0 = new com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda0(this);
            } catch (android.os.DeadObjectException e) {
                retryOrThrow(new com.pairip.licensecheck.LicenseCheckException("Licensing service process died.", e), true, backgroundLicensingServiceEnabled);
                parcelObtain.recycle();
                parcelObtain2.recycle();
                immediateTaskExecutor = mainThreadRunner;
                licenseClient$$ExternalSyntheticLambda0 = new com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda0(this);
            } catch (android.os.RemoteException e2) {
                android.util.Log.e(TAG, "Error when calling licensing service." + java.lang.String.valueOf(e2));
                parcelObtain.recycle();
                parcelObtain2.recycle();
                immediateTaskExecutor = mainThreadRunner;
                licenseClient$$ExternalSyntheticLambda0 = new com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda0(this);
            }
            immediateTaskExecutor.run(licenseClient$$ExternalSyntheticLambda0);
            android.util.Log.d(TAG, "Request to licensing reporting service sent.");
        } catch (java.lang.Throwable th) {
            parcelObtain.recycle();
            parcelObtain2.recycle();
            mainThreadRunner.run(new com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda0(this));
            android.util.Log.d(TAG, "Request to licensing reporting service sent.");
            throw th;
        }
    }

    private void populateInputDataForLicenseCheckV2(android.os.Parcel inputData, android.os.IBinder licensingService) throws android.os.RemoteException {
        inputData.writeInterfaceToken(licensingService.getInterfaceDescriptor());
        inputData.writeString(packageName);
        inputData.writeStrongBinder(createResultListener(this).asBinder());
        android.os.Bundle bundle = new android.os.Bundle();
        if (customTrialEndTriggered) {
            bundle.putBoolean(EXTRA_END_CUSTOM_TRIAL, true);
        }
        if (!bundle.isEmpty()) {
            inputData.writeInt(1);
            bundle.writeToParcel(inputData, 0);
        } else {
            inputData.writeInt(0);
        }
    }

    private void populateInputDataForReportAutoVerifiedLicense(android.os.Parcel inputData, android.os.IBinder licensingService) throws android.os.RemoteException {
        inputData.writeInterfaceToken(licensingService.getInterfaceDescriptor());
        inputData.writeString(packageName);
        inputData.writeInt(0);
    }

    private static com.pairip.licensecheck.ILicenseV2ResultListener createResultListener(com.pairip.licensecheck.LicenseClient client) {
        return new com.pairip.licensecheck.ILicenseV2ResultListener.Stub() { // from class: com.pairip.licensecheck.LicenseClient.2
            @Override // com.pairip.licensecheck.ILicenseV2ResultListener
            public void verifyLicense(int responseCode, android.os.Bundle responsePayload2) {
                com.pairip.licensecheck.LicenseClient.this.processResponse(responseCode, responsePayload2);
            }
        };
    }

    private void retryOrThrow(com.pairip.licensecheck.LicenseCheckException error) {
        retryOrThrow(error, false, false);
    }

    private void retryOrThrow(final com.pairip.licensecheck.LicenseCheckException error, final boolean ignoreErrorOnFinalFailure, final boolean useBackgroundService) {
        mainThreadRunner.run(new java.lang.Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$retryOrThrow$0(useBackgroundService, error, ignoreErrorOnFinalFailure);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$retryOrThrow$0(final boolean z, com.pairip.licensecheck.LicenseCheckException licenseCheckException, boolean z2) {
        unbindFromLicensingService();
        int i = this.retryNum;
        if (i < 3) {
            this.retryNum = i + 1;
            this.delayedTaskExecutor.schedule(new java.lang.Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda13
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$retryOrThrow$1(z);
                }
            }, 2000L);
            android.util.Log.d(TAG, java.lang.String.format("Retry #%d. License check failed with error '%s'. Next try in %ds...", java.lang.Integer.valueOf(this.retryNum), licenseCheckException == null ? "null" : licenseCheckException.getMessage(), 2L));
        } else {
            if (z2) {
                android.util.Log.e(TAG, "Retry limit reached for: " + java.lang.String.valueOf(licenseCheckException));
                return;
            }
            handleError(licenseCheckException);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processResponse(int responseCode, final android.os.Bundle responsePayload2) {
        com.pairip.licensecheck.LicenseClient.ImmediateTaskExecutor immediateTaskExecutor;
        com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda0 licenseClient$$ExternalSyntheticLambda0;
        try {
            try {
            } catch (com.pairip.licensecheck.LicenseCheckException e) {
                handleError(e);
                immediateTaskExecutor = mainThreadRunner;
                licenseClient$$ExternalSyntheticLambda0 = new com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda0(this);
            }
            if (responseCode == 3) {
                throw new com.pairip.licensecheck.LicenseCheckException("Request package name invalid.");
            }
            if (responseCode == 0) {
                com.pairip.licensecheck.LicenseResponseHelper.validateResponse(responsePayload2, packageName);
                android.util.Log.i(TAG, "License check succeeded.");
                final com.pairip.licensecheck.RepeatedCheckMetadata repeatedCheckMetadata = repeatedCheckEnabled ? com.pairip.licensecheck.LicenseResponseHelper.getRepeatedCheckMetadata(responsePayload2) : null;
                mainThreadRunner.run(new java.lang.Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda11
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.lambda$processResponse$0(repeatedCheckMetadata, responsePayload2);
                    }
                });
            } else if (responseCode == 2) {
                startPaywallActivity((android.app.PendingIntent) responsePayload2.getParcelable(PAYLOAD_PAYWALL));
            } else {
                throw new com.pairip.licensecheck.LicenseCheckException(java.lang.String.format("Unexpected response code %d received.", java.lang.Integer.valueOf(responseCode)));
            }
            immediateTaskExecutor = mainThreadRunner;
            licenseClient$$ExternalSyntheticLambda0 = new com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda0(this);
            immediateTaskExecutor.run(licenseClient$$ExternalSyntheticLambda0);
        } catch (java.lang.Throwable th) {
            mainThreadRunner.run(new com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda0(this));
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processResponse$0(com.pairip.licensecheck.RepeatedCheckMetadata repeatedCheckMetadata, android.os.Bundle bundle) {
        if (repeatedCheckMetadata != null) {
            licenseCheckState = com.pairip.licensecheck.LicenseClient.LicenseCheckState.REPEATED_CHECK_REQUIRED;
            this.repeatedCheckStartElapsedRealtime = getElapsedRealtimeMillis();
            scheduleRepeatedLicenseCheck(repeatedCheckMetadata);
        } else {
            licenseCheckState = com.pairip.licensecheck.LicenseClient.LicenseCheckState.FULL_CHECK_OK;
        }
        responsePayload = bundle;
    }

    private void scheduleRepeatedLicenseCheck(final com.pairip.licensecheck.RepeatedCheckMetadata repeatedCheckMetadata) {
        long jMin = java.lang.Math.min(java.lang.Math.min(repeatedCheckMetadata.getDurationToRetryMillis(), java.lang.Math.max(0L, repeatedCheckMetadata.getTimeToRetryMillis() - getCurrentTimeMillis())), 300000L);
        if (!this.waitingForRepeatedCheck) {
            this.waitingForRepeatedCheck = true;
        }
        this.delayedTaskExecutor.schedule(new java.lang.Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$scheduleRepeatedLicenseCheck$0(repeatedCheckMetadata);
            }
        }, jMin);
        android.util.Log.d(TAG, java.lang.String.format("Repeated license check is scheduled in %d ms...", java.lang.Long.valueOf(jMin)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$scheduleRepeatedLicenseCheck$0(com.pairip.licensecheck.RepeatedCheckMetadata repeatedCheckMetadata) {
        long elapsedRealtimeMillis = getElapsedRealtimeMillis() - this.repeatedCheckStartElapsedRealtime;
        if (getCurrentTimeMillis() >= repeatedCheckMetadata.getTimeToRetryMillis() || elapsedRealtimeMillis >= repeatedCheckMetadata.getDurationToRetryMillis()) {
            this.waitingForRepeatedCheck = false;
            initiateFreshLicensingServiceConnection(false);
        } else {
            android.util.Log.d(TAG, "Repeated license check is rescheduled.");
            scheduleRepeatedLicenseCheck(repeatedCheckMetadata);
        }
    }

    protected void unbindFromLicensingService() {
        if (this.isBound) {
            this.isBound = false;
            try {
                this.context.unbindService(this);
            } catch (java.lang.RuntimeException e) {
                android.util.Log.e(TAG, "Failed to unbind from licensing service.", e);
            }
        }
    }

    private static boolean isLocalCheckPassed() {
        return licenseCheckState.equals(com.pairip.licensecheck.LicenseClient.LicenseCheckState.LOCAL_CHECK_OK) || licenseCheckState.equals(com.pairip.licensecheck.LicenseClient.LicenseCheckState.LOCAL_CHECK_REPORTED);
    }

    private void handleError(final com.pairip.licensecheck.LicenseCheckException ex) {
        mainThreadRunner.run(new java.lang.Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$handleError$0(ex);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleError$0(com.pairip.licensecheck.LicenseCheckException licenseCheckException) {
        android.util.Log.e(TAG, "Error while checking license: " + android.util.Log.getStackTraceString(licenseCheckException));
        unbindFromLicensingService();
        if (licenseCheckState.equals(com.pairip.licensecheck.LicenseClient.LicenseCheckState.FULL_CHECK_OK) || isLocalCheckPassed()) {
            return;
        }
        startErrorDialogActivity();
    }

    private void startPaywallActivity(android.app.PendingIntent paywallIntent) {
        android.content.Intent intentCreateCloseAppIntentOrExitIfAppInBackground = createCloseAppIntentOrExitIfAppInBackground();
        intentCreateCloseAppIntentOrExitIfAppInBackground.putExtra(com.pairip.licensecheck.LicenseActivity.PAYWALL_INTENT_ARG_NAME, paywallIntent);
        intentCreateCloseAppIntentOrExitIfAppInBackground.putExtra(com.pairip.licensecheck.LicenseActivity.ACTIVITY_TYPE_ARG_NAME, com.pairip.licensecheck.LicenseActivity.ActivityType.PAYWALL);
        scheduleAppShutdown();
        this.context.startActivity(intentCreateCloseAppIntentOrExitIfAppInBackground);
    }

    private void startErrorDialogActivity() {
        android.content.Intent intentCreateCloseAppIntentOrExitIfAppInBackground = createCloseAppIntentOrExitIfAppInBackground();
        intentCreateCloseAppIntentOrExitIfAppInBackground.putExtra(com.pairip.licensecheck.LicenseActivity.ACTIVITY_TYPE_ARG_NAME, com.pairip.licensecheck.LicenseActivity.ActivityType.ERROR_DIALOG);
        scheduleAppShutdown();
        this.context.startActivity(intentCreateCloseAppIntentOrExitIfAppInBackground);
    }

    private android.content.Intent createCloseAppIntentOrExitIfAppInBackground() {
        if (!isForeground()) {
            exitAction.run();
        }
        android.content.Intent intent = new android.content.Intent(this.context, (java.lang.Class<?>) com.pairip.licensecheck.LicenseActivity.class);
        if (gracefulShutdownEnabled) {
            intent.addFlags(65536);
        } else {
            intent.addFlags(67108864);
            intent.addFlags(32768);
        }
        intent.addFlags(268435456);
        return intent;
    }

    private boolean isForeground() {
        android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new android.app.ActivityManager.RunningAppProcessInfo();
        android.app.ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo.importance <= 100;
    }

    protected long getCurrentTimeMillis() {
        return java.lang.System.currentTimeMillis();
    }

    protected long getElapsedRealtimeMillis() {
        return android.os.SystemClock.elapsedRealtime();
    }

    private void scheduleAppShutdown() {
        if (eventualShutdownEnabled) {
            this.delayedTaskExecutor.schedule(exitAction, 30000L);
        }
    }

    private static class DelayedTaskExecutorImpl implements com.pairip.licensecheck.LicenseClient.DelayedTaskExecutor {
        private final android.os.Handler handler;

        private DelayedTaskExecutorImpl() {
            this.handler = new android.os.Handler(android.os.Looper.getMainLooper());
        }

        @Override // com.pairip.licensecheck.LicenseClient.DelayedTaskExecutor
        public void schedule(java.lang.Runnable task, long delayMillis) {
            this.handler.postDelayed(task, delayMillis);
        }
    }
}
