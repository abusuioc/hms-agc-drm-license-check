package mobileservices.licensecheck.hms;

import android.app.Activity;

public class Drm {
    static public void check(Activity activity, String pkgName, String drmId, String drmPublicKey, final DrmCheckCallback callback) {
        com.huawei.android.sdk.drm.Drm.check(
                activity,
                pkgName,
                drmId,
                drmPublicKey,
                new com.huawei.android.sdk.drm.DrmCheckCallback() {
                    @Override
                    public void onCheckSuccess() {
                        callback.onCheckSuccess();
                    }

                    @Override
                    public void onCheckFailed() {
                        callback.onCheckFailed();
                    }
                }
        );
    }

    public interface CheckCallback {
        void onCheckCompleted(boolean isSuccessful);
    }
}
