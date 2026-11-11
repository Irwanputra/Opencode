.class public Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$ぁごぐすすぃ;
.super Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3041\u3054\u3050\u3059\u3059\u3043"
.end annotation


# instance fields
.field public ぁごぐすすぃ:Z


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$ぁごぐすすぃ;->ぁごぐすすぃ:Z

    return-void
.end method


# virtual methods
.method public くし〴〺ぅ(Landroid/view/View;F)V
    .registers 10

    instance-of v0, p1, Landroidx/constraintlayout/motion/widget/MotionLayout;

    if-eqz v0, :cond_e

    check-cast p1, Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-virtual {p0, p2}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ;->げつ〴ぬぐ(F)F

    move-result p2

    invoke-virtual {p1, p2}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setProgress(F)V

    goto :goto_3a

    :cond_e
    iget-boolean v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$ぁごぐすすぃ;->ぁごぐすすぃ:Z

    if-eqz v0, :cond_13

    return-void

    :cond_13
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    :try_start_16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    const-string v4, "setProgress"

    new-array v5, v2, [Ljava/lang/Class;

    sget-object v6, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    aput-object v6, v5, v1

    invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0
    :try_end_26
    .catch Ljava/lang/NoSuchMethodException; {:try_start_16 .. :try_end_26} :catch_27

    goto :goto_29

    :catch_27
    iput-boolean v2, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$ぁごぐすすぃ;->ぁごぐすすぃ:Z

    :goto_29
    if-eqz v0, :cond_3a

    :try_start_2b
    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p0, p2}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ;->げつ〴ぬぐ(F)F

    move-result p2

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    aput-object p2, v2, v1

    invoke-virtual {v0, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3a
    .catch Ljava/lang/IllegalAccessException; {:try_start_2b .. :try_end_3a} :catch_3a
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2b .. :try_end_3a} :catch_3a

    :catch_3a
    :cond_3a
    :goto_3a
    return-void
.end method
