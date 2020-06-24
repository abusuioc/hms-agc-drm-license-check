package mobileservices.licensecheck.hms;

public interface DrmCheckCallback {
    void onCheckSuccess();

    void onCheckFailed();
}