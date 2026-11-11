.class public Landroidx/transition/ChangeTransform$づざかべべ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/ChangeTransform;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3065\u3056\u304b\u3079\u3079"
.end annotation


# instance fields
.field public final 〳ぜぞぜべっ:F

.field public final 〺つふすそ:F

.field public final ぁごぐすすぃ:F

.field public final くし〴〺ぅ:F

.field public final げつ〴ぬぐ:F

.field public final づざかべべ:F

.field public final なぎぱいぢぎ:F

.field public final びぐびあび:F


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/view/View;->getTranslationX()F

    move-result v0

    iput v0, p0, Landroidx/transition/ChangeTransform$づざかべべ;->げつ〴ぬぐ:F

    invoke-virtual {p1}, Landroid/view/View;->getTranslationY()F

    move-result v0

    iput v0, p0, Landroidx/transition/ChangeTransform$づざかべべ;->〺つふすそ:F

    .line 1
    sget-object v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->げつ〴ぬぐ:Ljava/util/concurrent/atomic/AtomicInteger;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_1c

    invoke-virtual {p1}, Landroid/view/View;->getTranslationZ()F

    move-result v0

    goto :goto_1d

    :cond_1c
    const/4 v0, 0x0

    .line 2
    :goto_1d
    iput v0, p0, Landroidx/transition/ChangeTransform$づざかべべ;->くし〴〺ぅ:F

    invoke-virtual {p1}, Landroid/view/View;->getScaleX()F

    move-result v0

    iput v0, p0, Landroidx/transition/ChangeTransform$づざかべべ;->びぐびあび:F

    invoke-virtual {p1}, Landroid/view/View;->getScaleY()F

    move-result v0

    iput v0, p0, Landroidx/transition/ChangeTransform$づざかべべ;->づざかべべ:F

    invoke-virtual {p1}, Landroid/view/View;->getRotationX()F

    move-result v0

    iput v0, p0, Landroidx/transition/ChangeTransform$づざかべべ;->なぎぱいぢぎ:F

    invoke-virtual {p1}, Landroid/view/View;->getRotationY()F

    move-result v0

    iput v0, p0, Landroidx/transition/ChangeTransform$づざかべべ;->ぁごぐすすぃ:F

    invoke-virtual {p1}, Landroid/view/View;->getRotation()F

    move-result p1

    iput p1, p0, Landroidx/transition/ChangeTransform$づざかべべ;->〳ぜぞぜべっ:F

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .registers 5

    instance-of v0, p1, Landroidx/transition/ChangeTransform$づざかべべ;

    const/4 v1, 0x0

    if-nez v0, :cond_6

    return v1

    :cond_6
    check-cast p1, Landroidx/transition/ChangeTransform$づざかべべ;

    iget v0, p1, Landroidx/transition/ChangeTransform$づざかべべ;->げつ〴ぬぐ:F

    iget v2, p0, Landroidx/transition/ChangeTransform$づざかべべ;->げつ〴ぬぐ:F

    cmpl-float v0, v0, v2

    if-nez v0, :cond_49

    iget v0, p1, Landroidx/transition/ChangeTransform$づざかべべ;->〺つふすそ:F

    iget v2, p0, Landroidx/transition/ChangeTransform$づざかべべ;->〺つふすそ:F

    cmpl-float v0, v0, v2

    if-nez v0, :cond_49

    iget v0, p1, Landroidx/transition/ChangeTransform$づざかべべ;->くし〴〺ぅ:F

    iget v2, p0, Landroidx/transition/ChangeTransform$づざかべべ;->くし〴〺ぅ:F

    cmpl-float v0, v0, v2

    if-nez v0, :cond_49

    iget v0, p1, Landroidx/transition/ChangeTransform$づざかべべ;->びぐびあび:F

    iget v2, p0, Landroidx/transition/ChangeTransform$づざかべべ;->びぐびあび:F

    cmpl-float v0, v0, v2

    if-nez v0, :cond_49

    iget v0, p1, Landroidx/transition/ChangeTransform$づざかべべ;->づざかべべ:F

    iget v2, p0, Landroidx/transition/ChangeTransform$づざかべべ;->づざかべべ:F

    cmpl-float v0, v0, v2

    if-nez v0, :cond_49

    iget v0, p1, Landroidx/transition/ChangeTransform$づざかべべ;->なぎぱいぢぎ:F

    iget v2, p0, Landroidx/transition/ChangeTransform$づざかべべ;->なぎぱいぢぎ:F

    cmpl-float v0, v0, v2

    if-nez v0, :cond_49

    iget v0, p1, Landroidx/transition/ChangeTransform$づざかべべ;->ぁごぐすすぃ:F

    iget v2, p0, Landroidx/transition/ChangeTransform$づざかべべ;->ぁごぐすすぃ:F

    cmpl-float v0, v0, v2

    if-nez v0, :cond_49

    iget p1, p1, Landroidx/transition/ChangeTransform$づざかべべ;->〳ぜぞぜべっ:F

    iget v0, p0, Landroidx/transition/ChangeTransform$づざかべべ;->〳ぜぞぜべっ:F

    cmpl-float p1, p1, v0

    if-nez p1, :cond_49

    const/4 v1, 0x1

    :cond_49
    return v1
.end method

.method public hashCode()I
    .registers 6

    iget v0, p0, Landroidx/transition/ChangeTransform$づざかべべ;->げつ〴ぬぐ:F

    const/4 v1, 0x0

    const/4 v2, 0x0

    cmpl-float v3, v0, v2

    if-eqz v3, :cond_d

    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v0

    goto :goto_e

    :cond_d
    const/4 v0, 0x0

    :goto_e
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Landroidx/transition/ChangeTransform$づざかべべ;->〺つふすそ:F

    cmpl-float v4, v3, v2

    if-eqz v4, :cond_1b

    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v3

    goto :goto_1c

    :cond_1b
    const/4 v3, 0x0

    :goto_1c
    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Landroidx/transition/ChangeTransform$づざかべべ;->くし〴〺ぅ:F

    cmpl-float v4, v3, v2

    if-eqz v4, :cond_2a

    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v3

    goto :goto_2b

    :cond_2a
    const/4 v3, 0x0

    :goto_2b
    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Landroidx/transition/ChangeTransform$づざかべべ;->びぐびあび:F

    cmpl-float v4, v3, v2

    if-eqz v4, :cond_39

    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v3

    goto :goto_3a

    :cond_39
    const/4 v3, 0x0

    :goto_3a
    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Landroidx/transition/ChangeTransform$づざかべべ;->づざかべべ:F

    cmpl-float v4, v3, v2

    if-eqz v4, :cond_48

    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v3

    goto :goto_49

    :cond_48
    const/4 v3, 0x0

    :goto_49
    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Landroidx/transition/ChangeTransform$づざかべべ;->なぎぱいぢぎ:F

    cmpl-float v4, v3, v2

    if-eqz v4, :cond_57

    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v3

    goto :goto_58

    :cond_57
    const/4 v3, 0x0

    :goto_58
    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Landroidx/transition/ChangeTransform$づざかべべ;->ぁごぐすすぃ:F

    cmpl-float v4, v3, v2

    if-eqz v4, :cond_66

    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v3

    goto :goto_67

    :cond_66
    const/4 v3, 0x0

    :goto_67
    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Landroidx/transition/ChangeTransform$づざかべべ;->〳ぜぞぜべっ:F

    cmpl-float v2, v3, v2

    if-eqz v2, :cond_74

    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    :cond_74
    add-int/2addr v0, v1

    return v0
.end method

.method public げつ〴ぬぐ(Landroid/view/View;)V
    .registers 11

    iget v1, p0, Landroidx/transition/ChangeTransform$づざかべべ;->げつ〴ぬぐ:F

    iget v2, p0, Landroidx/transition/ChangeTransform$づざかべべ;->〺つふすそ:F

    iget v3, p0, Landroidx/transition/ChangeTransform$づざかべべ;->くし〴〺ぅ:F

    iget v4, p0, Landroidx/transition/ChangeTransform$づざかべべ;->びぐびあび:F

    iget v5, p0, Landroidx/transition/ChangeTransform$づざかべべ;->づざかべべ:F

    iget v6, p0, Landroidx/transition/ChangeTransform$づざかべべ;->なぎぱいぢぎ:F

    iget v7, p0, Landroidx/transition/ChangeTransform$づざかべべ;->ぁごぐすすぃ:F

    iget v8, p0, Landroidx/transition/ChangeTransform$づざかべべ;->〳ぜぞぜべっ:F

    move-object v0, p1

    invoke-static/range {v0 .. v8}, Landroidx/transition/ChangeTransform;->おかぷせ〱(Landroid/view/View;FFFFFFFF)V

    return-void
.end method
