.class public Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$げつ〴ぬぐ;
.super Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$くし〴〺ぅ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# static fields
.field public static くし〴〺ぅ:Ljava/lang/reflect/Field;

.field public static づざかべべ:Ljava/lang/reflect/Constructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/reflect/Constructor<",
            "Landroid/view/WindowInsets;",
            ">;"
        }
    .end annotation
.end field

.field public static なぎぱいぢぎ:Z

.field public static びぐびあび:Z


# instance fields
.field public 〺つふすそ:Landroid/view/WindowInsets;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$くし〴〺ぅ;-><init>()V

    invoke-static {}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$げつ〴ぬぐ;->びぐびあび()Landroid/view/WindowInsets;

    move-result-object v0

    iput-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$げつ〴ぬぐ;->〺つふすそ:Landroid/view/WindowInsets;

    return-void
.end method

.method public constructor <init>(Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;)V
    .registers 2

    invoke-direct {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$くし〴〺ぅ;-><init>()V

    invoke-virtual {p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->いいにぽつ()Landroid/view/WindowInsets;

    move-result-object p1

    iput-object p1, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$げつ〴ぬぐ;->〺つふすそ:Landroid/view/WindowInsets;

    return-void
.end method

.method public static びぐびあび()Landroid/view/WindowInsets;
    .registers 6

    sget-boolean v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$げつ〴ぬぐ;->びぐびあび:Z

    const/4 v1, 0x1

    if-nez v0, :cond_11

    :try_start_5
    const-class v0, Landroid/view/WindowInsets;

    const-string v2, "CONSUMED"

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    sput-object v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$げつ〴ぬぐ;->くし〴〺ぅ:Ljava/lang/reflect/Field;
    :try_end_f
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_5 .. :try_end_f} :catch_f

    :catch_f
    sput-boolean v1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$げつ〴ぬぐ;->びぐびあび:Z

    :cond_11
    sget-object v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$げつ〴ぬぐ;->くし〴〺ぅ:Ljava/lang/reflect/Field;

    const/4 v2, 0x0

    if-eqz v0, :cond_25

    :try_start_16
    invoke-virtual {v0, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowInsets;

    if-eqz v0, :cond_25

    new-instance v3, Landroid/view/WindowInsets;

    invoke-direct {v3, v0}, Landroid/view/WindowInsets;-><init>(Landroid/view/WindowInsets;)V
    :try_end_23
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_16 .. :try_end_23} :catch_24

    return-object v3

    :catch_24
    nop

    :cond_25
    sget-boolean v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$げつ〴ぬぐ;->なぎぱいぢぎ:Z

    const/4 v3, 0x0

    if-nez v0, :cond_3a

    :try_start_2a
    const-class v0, Landroid/view/WindowInsets;

    new-array v4, v1, [Ljava/lang/Class;

    const-class v5, Landroid/graphics/Rect;

    aput-object v5, v4, v3

    invoke-virtual {v0, v4}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    sput-object v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$げつ〴ぬぐ;->づざかべべ:Ljava/lang/reflect/Constructor;
    :try_end_38
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_2a .. :try_end_38} :catch_38

    :catch_38
    sput-boolean v1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$げつ〴ぬぐ;->なぎぱいぢぎ:Z

    :cond_3a
    sget-object v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$げつ〴ぬぐ;->づざかべべ:Ljava/lang/reflect/Constructor;

    if-eqz v0, :cond_4e

    :try_start_3e
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    aput-object v4, v1, v3

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowInsets;
    :try_end_4d
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_3e .. :try_end_4d} :catch_4e

    return-object v0

    :catch_4e
    :cond_4e
    return-object v2
.end method


# virtual methods
.method public くし〴〺ぅ(Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;)V
    .registers 6

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$げつ〴ぬぐ;->〺つふすそ:Landroid/view/WindowInsets;

    if-eqz v0, :cond_12

    iget v1, p1, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;->げつ〴ぬぐ:I

    iget v2, p1, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;->〺つふすそ:I

    iget v3, p1, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;->くし〴〺ぅ:I

    iget p1, p1, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;->びぐびあび:I

    invoke-virtual {v0, v1, v2, v3, p1}, Landroid/view/WindowInsets;->replaceSystemWindowInsets(IIII)Landroid/view/WindowInsets;

    move-result-object p1

    iput-object p1, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$げつ〴ぬぐ;->〺つふすそ:Landroid/view/WindowInsets;

    :cond_12
    return-void
.end method

.method public げつ〴ぬぐ()Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;
    .registers 2

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$げつ〴ぬぐ;->〺つふすそ:Landroid/view/WindowInsets;

    invoke-static {v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->ぺふねづ〺(Landroid/view/WindowInsets;)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    move-result-object v0

    return-object v0
.end method
