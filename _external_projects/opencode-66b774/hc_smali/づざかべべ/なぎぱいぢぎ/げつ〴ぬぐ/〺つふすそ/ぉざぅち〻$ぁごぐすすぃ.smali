.class public Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻$ぁごぐすすぃ;
.super Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3041\u3054\u3050\u3059\u3059\u3043"
.end annotation


# instance fields
.field public なぎぱいぢぎ:Z


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻$ぁごぐすすぃ;->なぎぱいぢぎ:Z

    return-void
.end method


# virtual methods
.method public くし〴〺ぅ(Landroid/view/View;F)V
    .registers 10

    instance-of v0, p1, Landroidx/constraintlayout/motion/widget/MotionLayout;

    const/4 v1, 0x0

    if-eqz v0, :cond_13

    check-cast p1, Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 1
    iget-object v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;->げつ〴ぬぐ:Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    float-to-double v2, p2

    invoke-virtual {v0, v2, v3, v1}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ(DI)D

    move-result-wide v0

    double-to-float p2, v0

    .line 2
    invoke-virtual {p1, p2}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setProgress(F)V

    goto :goto_42

    :cond_13
    iget-boolean v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻$ぁごぐすすぃ;->なぎぱいぢぎ:Z

    if-eqz v0, :cond_18

    return-void

    :cond_18
    const/4 v0, 0x0

    const/4 v2, 0x1

    :try_start_1a
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    const-string v4, "setProgress"

    new-array v5, v2, [Ljava/lang/Class;

    sget-object v6, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    aput-object v6, v5, v1

    invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0
    :try_end_2a
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1a .. :try_end_2a} :catch_2b

    goto :goto_2d

    :catch_2b
    iput-boolean v2, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻$ぁごぐすすぃ;->なぎぱいぢぎ:Z

    :goto_2d
    if-eqz v0, :cond_42

    :try_start_2f
    new-array v2, v2, [Ljava/lang/Object;

    .line 3
    iget-object v3, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;->げつ〴ぬぐ:Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    float-to-double v4, p2

    invoke-virtual {v3, v4, v5, v1}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ(DI)D

    move-result-wide v3

    double-to-float p2, v3

    .line 4
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    aput-object p2, v2, v1

    invoke-virtual {v0, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_42
    .catch Ljava/lang/IllegalAccessException; {:try_start_2f .. :try_end_42} :catch_42
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2f .. :try_end_42} :catch_42

    :catch_42
    :cond_42
    :goto_42
    return-void
.end method
