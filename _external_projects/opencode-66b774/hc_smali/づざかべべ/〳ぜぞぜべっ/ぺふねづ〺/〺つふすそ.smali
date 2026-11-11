.class public final Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/〺つふすそ;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static 〺つふすそ:Ljava/lang/reflect/Method;

.field public static げつ〴ぬぐ:Ljava/lang/reflect/Method;


# direct methods
.method public static constructor <clinit>()V
    .registers 7

    const-class v0, Ljava/lang/String;

    const-string v1, "libcore.icu.ICU"

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const-string v3, "addLikelySubtags"

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/16 v6, 0x15

    if-ge v2, v6, :cond_2f

    :try_start_e
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v2, "getScript"

    new-array v6, v5, [Ljava/lang/Class;

    aput-object v0, v6, v4

    invoke-virtual {v1, v2, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    sput-object v2, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/〺つふすそ;->げつ〴ぬぐ:Ljava/lang/reflect/Method;

    new-array v2, v5, [Ljava/lang/Class;

    aput-object v0, v2, v4

    invoke-virtual {v1, v3, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/〺つふすそ;->〺つふすそ:Ljava/lang/reflect/Method;
    :try_end_28
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_28} :catch_29

    goto :goto_4b

    :catch_29
    const/4 v0, 0x0

    sput-object v0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/〺つふすそ;->げつ〴ぬぐ:Ljava/lang/reflect/Method;

    sput-object v0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/〺つふすそ;->〺つふすそ:Ljava/lang/reflect/Method;

    goto :goto_4b

    :cond_2f
    const/16 v0, 0x18

    if-ge v2, v0, :cond_4b

    :try_start_33
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    new-array v1, v5, [Ljava/lang/Class;

    const-class v2, Ljava/util/Locale;

    aput-object v2, v1, v4

    invoke-virtual {v0, v3, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/〺つふすそ;->〺つふすそ:Ljava/lang/reflect/Method;
    :try_end_43
    .catch Ljava/lang/Exception; {:try_start_33 .. :try_end_43} :catch_44

    goto :goto_4b

    :catch_44
    move-exception v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_4b
    :goto_4b
    return-void
.end method
