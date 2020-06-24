# Friendlier access to Huawei AppGallery DRM license check library

[![](https://jitpack.io/v/abusuioc/hms-agc-drm-license-check.svg?style=flat-square)](https://jitpack.io/#abusuioc/hms-agc-drm-license-check)

The original AppGallery DRM license check library is used to check if a (paid) app was downloaded (and paid for) via Huawei AppGallery. The SDK documentation can be found here: https://developer.huawei.com/consumer/en/doc/development/AppGallery-connect-Guides/appgallerykit-paydownload-sdkdownload

The default usage is not very developer friendly:

- you have to download an archive,
- extract a jar file to your project's libs directory,
- copy a bunch of string files to your project's resource directory,
- add entries to the manifest file.



*Wouldn't it be more convenient if you could just add the lib as a regular remote dependency and start using it right away? Answer is yes? Then let's get started:* 

## Usage

In your root `build.gradle` add [Jitpack](https://jitpack.io/) to the list of known repositories.

```gradle
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

Then add the actual library dependency in your app `build.gradle`:

```gradle
dependencies {
	implementation 'com.github.abusuioc:hms-agc-drm-license-check:2.5.2.300'
}
```

From now on, you can just call the SDK methods as you would do otherwise.

The most useful is: [Drm.check()](https://developer.huawei.com/consumer/en/doc/development/AppGallery-connect-Guides/appgallerykit-paydownload-check) 