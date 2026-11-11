.class public Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/ぺぁあねじ;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final 〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/ぺぁあねじ;

.field public static final げつ〴ぬぐ:I


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    sget-object v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/ぉざぅち〻;->げつ〴ぬぐ:Ljava/util/concurrent/atomic/AtomicBoolean;

    const v0, 0xb5bb70

    sput v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/ぺぁあねじ;->げつ〴ぬぐ:I

    new-instance v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/ぺぁあねじ;

    invoke-direct {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/ぺぁあねじ;-><init>()V

    sput-object v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/ぺぁあねじ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/ぺぁあねじ;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static 〺つふすそ(Landroid/content/Context;)I
    .registers 3

    .line 1
    sget-object v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/ぉざぅち〻;->げつ〴ぬぐ:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    :try_start_3
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    const-string v1, "com.google.android.gms"

    invoke-virtual {p0, v1, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0
    :try_end_d
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_3 .. :try_end_d} :catch_f

    iget v0, p0, Landroid/content/pm/PackageInfo;->versionCode:I

    :catch_f
    return v0
.end method


# virtual methods
.method public げつ〴ぬぐ(Landroid/content/Context;)I
    .registers 12

    .line 1
    sget-object v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/ぉざぅち〻;->げつ〴ぬぐ:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    :try_start_6
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/げつ〴ぬぐ;->common_google_play_services_unknown_issue:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
    :try_end_f
    .catchall {:try_start_6 .. :try_end_f} :catchall_10

    goto :goto_11

    :catchall_10
    nop

    :goto_11
    const-string v1, "com.google.android.gms"

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_96

    sget-object v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/ぉざぅち〻;->げつ〴ぬぐ:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-nez v1, :cond_96

    .line 2
    sget-object v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/ぇぬぎばつ;->げつ〴ぬぐ:Ljava/lang/Object;

    monitor-enter v1

    :try_start_29
    sget-boolean v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/ぇぬぎばつ;->〺つふすそ:Z

    if-eqz v3, :cond_2e

    goto :goto_50

    :cond_2e
    sput-boolean v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/ぇぬぎばつ;->〺つふすそ:Z

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-static {p1}, Lcom/google/android/gms/internal/zzbhf;->zzdb(Landroid/content/Context;)Lcom/google/android/gms/internal/zzbhe;

    move-result-object v4
    :try_end_38
    .catchall {:try_start_29 .. :try_end_38} :catchall_93

    const/16 v5, 0x80

    :try_start_3a
    invoke-virtual {v4, v3, v5}, Lcom/google/android/gms/internal/zzbhe;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v3

    iget-object v3, v3, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    if-nez v3, :cond_43

    goto :goto_50

    :cond_43
    const-string v4, "com.google.app.id"

    invoke-virtual {v3, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    const-string v4, "com.google.android.gms.version"

    invoke-virtual {v3, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v3

    sput v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/ぇぬぎばつ;->くし〴〺ぅ:I
    :try_end_50
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_3a .. :try_end_50} :catch_50
    .catchall {:try_start_3a .. :try_end_50} :catchall_93

    :catch_50
    :goto_50
    :try_start_50
    monitor-exit v1
    :try_end_51
    .catchall {:try_start_50 .. :try_end_51} :catchall_93

    .line 3
    sget v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/ぇぬぎばつ;->くし〴〺ぅ:I

    if-eqz v1, :cond_8b

    const v3, 0xb5bb70

    if-ne v1, v3, :cond_5b

    goto :goto_96

    .line 4
    :cond_5b
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "com.google.android.gms.version"

    const/16 v2, 0x140

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "The meta-data tag in your app\'s AndroidManifest.xml does not have the right value.  Expected "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " but found "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ".  You must have the following declaration within the <application> element:     <meta-data android:name=\""

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\" android:value=\"@integer/google_play_services_version\" />"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8b
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "A required meta-data tag in your app\'s AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_93
    move-exception p1

    .line 5
    :try_start_94
    monitor-exit v1
    :try_end_95
    .catchall {:try_start_94 .. :try_end_95} :catchall_93

    throw p1

    .line 6
    :cond_96
    :goto_96
    invoke-static {}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ておぞぞはね()Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_a3

    invoke-static {p1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->〺えなひあ(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_d1

    .line 7
    :cond_a3
    sget-object v1, Lづざかべべ/は〲ぱなで/〺つふすそ;->いいにぽつ:Ljava/lang/Boolean;

    if-nez v1, :cond_c7

    .line 8
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x14

    if-lt v1, v4, :cond_af

    const/4 v1, 0x1

    goto :goto_b0

    :cond_af
    const/4 v1, 0x0

    :goto_b0
    if-eqz v1, :cond_c0

    .line 9
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const-string v4, "android.hardware.type.watch"

    invoke-virtual {v1, v4}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_c0

    const/4 v1, 0x1

    goto :goto_c1

    :cond_c0
    const/4 v1, 0x0

    :goto_c1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    sput-object v1, Lづざかべべ/は〲ぱなで/〺つふすそ;->いいにぽつ:Ljava/lang/Boolean;

    :cond_c7
    sget-object v1, Lづざかべべ/は〲ぱなで/〺つふすそ;->いいにぽつ:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_d1

    const/4 v1, 0x1

    goto :goto_d2

    :cond_d1
    const/4 v1, 0x0

    :goto_d2
    if-nez v1, :cond_104

    .line 10
    sget-object v1, Lづざかべべ/は〲ぱなで/〺つふすそ;->てぜきぽく:Ljava/lang/Boolean;

    if-nez v1, :cond_fa

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const-string v4, "android.hardware.type.iot"

    invoke-virtual {v1, v4}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_f3

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const-string v4, "android.hardware.type.embedded"

    invoke-virtual {v1, v4}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_f1

    goto :goto_f3

    :cond_f1
    const/4 v1, 0x0

    goto :goto_f4

    :cond_f3
    :goto_f3
    const/4 v1, 0x1

    :goto_f4
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    sput-object v1, Lづざかべべ/は〲ぱなで/〺つふすそ;->てぜきぽく:Ljava/lang/Boolean;

    :cond_fa
    sget-object v1, Lづざかべべ/は〲ぱなで/〺つふすそ;->てぜきぽく:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_104

    const/4 v1, 0x1

    goto :goto_105

    :cond_104
    const/4 v1, 0x0

    :goto_105
    const/4 v4, 0x0

    const/16 v5, 0x9

    if-eqz v1, :cond_112

    :try_start_10a
    const-string v4, "com.android.vending"

    const/16 v6, 0x2040

    .line 11
    invoke-virtual {v0, v4, v6}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v4
    :try_end_112
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_10a .. :try_end_112} :catch_178

    :cond_112
    :try_start_112
    const-string v6, "com.google.android.gms"

    const/16 v7, 0x40

    invoke-virtual {v0, v6, v7}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v6
    :try_end_11a
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_112 .. :try_end_11a} :catch_177

    .line 12
    const-class v7, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/ざとぅぼこ〺;

    monitor-enter v7

    :try_start_11d
    sget-object v8, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/ざとぅぼこ〺;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/ざとぅぼこ〺;

    if-nez v8, :cond_13a

    .line 13
    const-class v8, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/いいにぽつ;

    monitor-enter v8
    :try_end_124
    .catchall {:try_start_11d .. :try_end_124} :catchall_174

    :try_start_124
    sget-object v9, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/いいにぽつ;->げつ〴ぬぐ:Landroid/content/Context;

    if-nez v9, :cond_12e

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v9

    sput-object v9, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/いいにぽつ;->げつ〴ぬぐ:Landroid/content/Context;
    :try_end_12e
    .catchall {:try_start_124 .. :try_end_12e} :catchall_137

    :cond_12e
    :try_start_12e
    monitor-exit v8

    .line 14
    new-instance v8, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/ざとぅぼこ〺;

    invoke-direct {v8, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/ざとぅぼこ〺;-><init>(Landroid/content/Context;)V

    sput-object v8, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/ざとぅぼこ〺;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/ざとぅぼこ〺;

    goto :goto_13a

    :catchall_137
    move-exception p1

    .line 15
    monitor-exit v8

    throw p1

    .line 16
    :cond_13a
    :goto_13a
    monitor-exit v7
    :try_end_13b
    .catchall {:try_start_12e .. :try_end_13b} :catchall_174

    .line 17
    sget-object v7, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/へぬ〴づぞ;->げつ〴ぬぐ:[Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/ぺふねづ〺;

    if-eqz v1, :cond_151

    invoke-static {v4, v7}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/ざとぅぼこ〺;->げつ〴ぬぐ(Landroid/content/pm/PackageInfo;[Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/ぺふねづ〺;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/ぺふねづ〺;

    move-result-object v1

    if-nez v1, :cond_146

    goto :goto_178

    :cond_146
    new-array v4, v2, [Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/ぺふねづ〺;

    aput-object v1, v4, v3

    invoke-static {v6, v4}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/ざとぅぼこ〺;->げつ〴ぬぐ(Landroid/content/pm/PackageInfo;[Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/ぺふねづ〺;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/ぺふねづ〺;

    move-result-object v1

    if-nez v1, :cond_158

    goto :goto_178

    :cond_151
    invoke-static {v6, v7}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/ざとぅぼこ〺;->げつ〴ぬぐ(Landroid/content/pm/PackageInfo;[Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/ぺふねづ〺;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/ぺふねづ〺;

    move-result-object v1

    if-nez v1, :cond_158

    goto :goto_178

    :cond_158
    const/16 v1, 0x2e86

    iget v4, v6, Landroid/content/pm/PackageInfo;->versionCode:I

    div-int/lit16 v4, v4, 0x3e8

    if-ge v4, v1, :cond_162

    const/4 v5, 0x2

    goto :goto_178

    :cond_162
    iget-object v1, v6, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    if-nez v1, :cond_16c

    :try_start_166
    const-string v1, "com.google.android.gms"

    invoke-virtual {v0, v1, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v1
    :try_end_16c
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_166 .. :try_end_16c} :catch_177

    :cond_16c
    iget-boolean v0, v1, Landroid/content/pm/ApplicationInfo;->enabled:Z

    if-nez v0, :cond_172

    const/4 v5, 0x3

    goto :goto_178

    :cond_172
    const/4 v5, 0x0

    goto :goto_178

    :catchall_174
    move-exception p1

    .line 18
    :try_start_175
    monitor-exit v7
    :try_end_176
    .catchall {:try_start_175 .. :try_end_176} :catchall_174

    throw p1

    :catch_177
    const/4 v5, 0x1

    :catch_178
    :goto_178
    const/16 v0, 0x12

    if-ne v5, v0, :cond_17d

    goto :goto_1bc

    :cond_17d
    if-ne v5, v2, :cond_1bb

    const-string v1, "com.google.android.gms"

    .line 19
    invoke-static {}, Lづざかべべ/は〲ぱなで/〺つふすそ;->〱〴なぱへて()Z

    move-result v4

    if-eqz v4, :cond_1ae

    :try_start_187
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/pm/PackageManager;->getPackageInstaller()Landroid/content/pm/PackageInstaller;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/pm/PackageInstaller;->getAllSessions()Ljava/util/List;

    move-result-object v4
    :try_end_193
    .catch Ljava/lang/Exception; {:try_start_187 .. :try_end_193} :catch_1bb

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_197
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1ae

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/content/pm/PackageInstaller$SessionInfo;

    invoke-virtual {v6}, Landroid/content/pm/PackageInstaller$SessionInfo;->getAppPackageName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_197

    goto :goto_1bc

    :cond_1ae
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    const/16 v2, 0x2000

    :try_start_1b4
    invoke-virtual {p1, v1, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object p1

    iget-boolean v2, p1, Landroid/content/pm/ApplicationInfo;->enabled:Z
    :try_end_1ba
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1b4 .. :try_end_1ba} :catch_1bb

    goto :goto_1bc

    :catch_1bb
    :cond_1bb
    const/4 v2, 0x0

    :goto_1bc
    if-eqz v2, :cond_1c0

    const/16 v5, 0x12

    :cond_1c0
    return v5
.end method
