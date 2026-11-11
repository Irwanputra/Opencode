.class public final Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/なぎぱいぢぎ;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final げつ〴ぬぐ:Ljava/util/Locale;


# direct methods
.method public static constructor <clinit>()V
    .registers 2

    new-instance v0, Ljava/util/Locale;

    const-string v1, ""

    invoke-direct {v0, v1, v1}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/なぎぱいぢぎ;->げつ〴ぬぐ:Ljava/util/Locale;

    return-void
.end method

.method public static げつ〴ぬぐ(Ljava/util/Locale;)I
    .registers 7

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_b

    invoke-static {p0}, Landroid/text/TextUtils;->getLayoutDirectionFromLocale(Ljava/util/Locale;)I

    move-result p0

    return p0

    :cond_b
    const/4 v1, 0x0

    if-eqz p0, :cond_93

    sget-object v2, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/なぎぱいぢぎ;->げつ〴ぬぐ:Ljava/util/Locale;

    invoke-virtual {p0, v2}, Ljava/util/Locale;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_93

    .line 1
    sget-object v2, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/〺つふすそ;->げつ〴ぬぐ:Ljava/lang/reflect/Method;

    const/16 v2, 0x18

    const/4 v3, 0x1

    if-lt v0, v2, :cond_2a

    invoke-static {p0}, Landroid/icu/util/ULocale;->forLocale(Ljava/util/Locale;)Landroid/icu/util/ULocale;

    move-result-object v0

    invoke-static {v0}, Landroid/icu/util/ULocale;->addLikelySubtags(Landroid/icu/util/ULocale;)Landroid/icu/util/ULocale;

    move-result-object v0

    invoke-virtual {v0}, Landroid/icu/util/ULocale;->getScript()Ljava/lang/String;

    move-result-object v0

    goto :goto_6c

    :cond_2a
    const/16 v2, 0x15

    const/4 v4, 0x0

    if-lt v0, v2, :cond_45

    :try_start_2f
    new-array v0, v3, [Ljava/lang/Object;

    aput-object p0, v0, v1

    sget-object v2, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/〺つふすそ;->〺つふすそ:Ljava/lang/reflect/Method;

    invoke-virtual {v2, v4, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getScript()Ljava/lang/String;

    move-result-object v0
    :try_end_3f
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2f .. :try_end_3f} :catch_40
    .catch Ljava/lang/IllegalAccessException; {:try_start_2f .. :try_end_3f} :catch_40

    goto :goto_6c

    :catch_40
    invoke-virtual {p0}, Ljava/util/Locale;->getScript()Ljava/lang/String;

    move-result-object v0

    goto :goto_6c

    .line 2
    :cond_45
    invoke-virtual {p0}, Ljava/util/Locale;->toString()Ljava/lang/String;

    move-result-object v0

    :try_start_49
    sget-object v2, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/〺つふすそ;->〺つふすそ:Ljava/lang/reflect/Method;

    if-eqz v2, :cond_5a

    new-array v5, v3, [Ljava/lang/Object;

    aput-object v0, v5, v1

    invoke-virtual {v2, v4, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;
    :try_end_57
    .catch Ljava/lang/IllegalAccessException; {:try_start_49 .. :try_end_57} :catch_59
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_49 .. :try_end_57} :catch_59

    move-object v0, v2

    goto :goto_5a

    :catch_59
    nop

    :cond_5a
    :goto_5a
    if-eqz v0, :cond_6b

    .line 3
    :try_start_5c
    sget-object v2, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/〺つふすそ;->げつ〴ぬぐ:Ljava/lang/reflect/Method;

    if-eqz v2, :cond_6b

    new-array v5, v3, [Ljava/lang/Object;

    aput-object v0, v5, v1

    invoke-virtual {v2, v4, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_6a
    .catch Ljava/lang/IllegalAccessException; {:try_start_5c .. :try_end_6a} :catch_6b
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_5c .. :try_end_6a} :catch_6b

    goto :goto_6c

    :catch_6b
    :cond_6b
    move-object v0, v4

    :goto_6c
    if-nez v0, :cond_82

    .line 4
    invoke-virtual {p0, p0}, Ljava/util/Locale;->getDisplayName(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result p0

    invoke-static {p0}, Ljava/lang/Character;->getDirectionality(C)B

    move-result p0

    if-eq p0, v3, :cond_80

    const/4 v0, 0x2

    if-eq p0, v0, :cond_80

    goto :goto_81

    :cond_80
    const/4 v1, 0x1

    :goto_81
    return v1

    :cond_82
    const-string p0, "Arab"

    .line 5
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_92

    const-string p0, "Hebr"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_93

    :cond_92
    return v3

    :cond_93
    return v1
.end method
