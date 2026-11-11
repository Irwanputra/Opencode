.class public final Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/びえぁぜい/くし〴〺ぅ;
.super Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/びえぁぜい/〺つふすそ;
.source ""


# static fields
.field public static びぐびあび:Ljava/lang/Class;


# instance fields
.field public final 〺つふすそ:Ljava/lang/Object;

.field public final くし〴〺ぅ:Ljava/lang/reflect/Field;


# direct methods
.method public constructor <init>()V
    .registers 4

    invoke-direct {p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/びえぁぜい/〺つふすそ;-><init>()V

    const/4 v0, 0x0

    :try_start_4
    const-string v1, "sun.misc.Unsafe"

    .line 1
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    sput-object v1, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/びえぁぜい/くし〴〺ぅ;->びぐびあび:Ljava/lang/Class;

    const-string v2, "theUnsafe"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_1a
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_1a} :catch_1b

    goto :goto_1c

    :catch_1b
    move-object v1, v0

    .line 2
    :goto_1c
    iput-object v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/びえぁぜい/くし〴〺ぅ;->〺つふすそ:Ljava/lang/Object;

    .line 3
    :try_start_1e
    const-class v1, Ljava/lang/reflect/AccessibleObject;

    const-string v2, "override"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0
    :try_end_26
    .catch Ljava/lang/NoSuchFieldException; {:try_start_1e .. :try_end_26} :catch_26

    .line 4
    :catch_26
    iput-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/びえぁぜい/くし〴〺ぅ;->くし〴〺ぅ:Ljava/lang/reflect/Field;

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ(Ljava/lang/reflect/AccessibleObject;)V
    .registers 12

    .line 1
    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/びえぁぜい/くし〴〺ぅ;->〺つふすそ:Ljava/lang/Object;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_58

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/びえぁぜい/くし〴〺ぅ;->くし〴〺ぅ:Ljava/lang/reflect/Field;

    if-eqz v0, :cond_58

    :try_start_a
    sget-object v0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/びえぁぜい/くし〴〺ぅ;->びぐびあび:Ljava/lang/Class;

    const-string v3, "objectFieldOffset"

    new-array v4, v1, [Ljava/lang/Class;

    const-class v5, Ljava/lang/reflect/Field;

    aput-object v5, v4, v2

    invoke-virtual {v0, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iget-object v3, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/びえぁぜい/くし〴〺ぅ;->〺つふすそ:Ljava/lang/Object;

    new-array v4, v1, [Ljava/lang/Object;

    iget-object v5, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/びえぁぜい/くし〴〺ぅ;->くし〴〺ぅ:Ljava/lang/reflect/Field;

    aput-object v5, v4, v2

    invoke-virtual {v0, v3, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    sget-object v0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/びえぁぜい/くし〴〺ぅ;->びぐびあび:Ljava/lang/Class;

    const-string v5, "putBoolean"

    const/4 v6, 0x3

    new-array v7, v6, [Ljava/lang/Class;

    const-class v8, Ljava/lang/Object;

    aput-object v8, v7, v2

    sget-object v8, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    aput-object v8, v7, v1

    sget-object v8, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v9, 0x2

    aput-object v8, v7, v9

    invoke-virtual {v0, v5, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iget-object v5, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/びえぁぜい/くし〴〺ぅ;->〺つふすそ:Ljava/lang/Object;

    new-array v6, v6, [Ljava/lang/Object;

    aput-object p1, v6, v2

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v6, v1

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    aput-object v3, v6, v9

    invoke-virtual {v0, v5, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_55
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_55} :catch_57

    const/4 v2, 0x1

    goto :goto_58

    :catch_57
    nop

    :cond_58
    :goto_58
    if-nez v2, :cond_7b

    .line 2
    :try_start_5a
    invoke-virtual {p1, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_5d
    .catch Ljava/lang/SecurityException; {:try_start_5a .. :try_end_5d} :catch_5e

    goto :goto_7b

    :catch_5e
    move-exception v0

    new-instance v1, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ざとぅぼこ〺;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Gson couldn\'t modify fields for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe."

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ざとぅぼこ〺;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_7b
    :goto_7b
    return-void
.end method
