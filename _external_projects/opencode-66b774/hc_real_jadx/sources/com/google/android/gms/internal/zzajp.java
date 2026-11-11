package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Range;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzajp {
    private static List<MediaCodecInfo> zzddk;
    private static Map<String, List<Map<String, Object>>> zzddj = new HashMap();
    private static final Object zzddl = new Object();

    @TargetApi(21)
    private static Integer[] zza(Range<Integer> range) {
        return new Integer[]{range.getLower(), range.getUpper()};
    }

    @TargetApi(16)
    public static List<Map<String, Object>> zzco(String str) {
        List<MediaCodecInfo> emptyList;
        ArrayList arrayList;
        Object obj = zzddl;
        synchronized (obj) {
            if (zzddj.containsKey(str)) {
                return zzddj.get(str);
            }
            try {
                synchronized (obj) {
                    if (zzddk == null) {
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 21) {
                            emptyList = Arrays.asList(new MediaCodecList(0).getCodecInfos());
                        } else if (i >= 16) {
                            int codecCount = MediaCodecList.getCodecCount();
                            zzddk = new ArrayList(codecCount);
                            for (int i2 = 0; i2 < codecCount; i2++) {
                                zzddk.add(MediaCodecList.getCodecInfoAt(i2));
                            }
                        } else {
                            emptyList = Collections.emptyList();
                        }
                        zzddk = emptyList;
                    }
                    arrayList = new ArrayList();
                    for (MediaCodecInfo mediaCodecInfo : zzddk) {
                        if (!mediaCodecInfo.isEncoder() && Arrays.asList(mediaCodecInfo.getSupportedTypes()).contains(str)) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("codecName", mediaCodecInfo.getName());
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                            ArrayList arrayList2 = new ArrayList();
                            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                                arrayList2.add(new Integer[]{Integer.valueOf(codecProfileLevel.profile), Integer.valueOf(codecProfileLevel.level)});
                            }
                            hashMap.put("profileLevels", arrayList2);
                            int i3 = Build.VERSION.SDK_INT;
                            if (i3 >= 21) {
                                MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                                hashMap.put("bitRatesBps", zza(videoCapabilities.getBitrateRange()));
                                hashMap.put("widthAlignment", Integer.valueOf(videoCapabilities.getWidthAlignment()));
                                hashMap.put("heightAlignment", Integer.valueOf(videoCapabilities.getHeightAlignment()));
                                hashMap.put("frameRates", zza(videoCapabilities.getSupportedFrameRates()));
                                hashMap.put("widths", zza(videoCapabilities.getSupportedWidths()));
                                hashMap.put("heights", zza(videoCapabilities.getSupportedHeights()));
                            }
                            if (i3 >= 23) {
                                hashMap.put("instancesLimit", Integer.valueOf(capabilitiesForType.getMaxSupportedInstances()));
                            }
                            arrayList.add(hashMap);
                        }
                    }
                    zzddj.put(str, arrayList);
                }
                return arrayList;
            } catch (LinkageError | RuntimeException e) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("error", e.getClass().getSimpleName());
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(hashMap2);
                zzddj.put(str, arrayList3);
                return arrayList3;
            }
        }
    }
}
