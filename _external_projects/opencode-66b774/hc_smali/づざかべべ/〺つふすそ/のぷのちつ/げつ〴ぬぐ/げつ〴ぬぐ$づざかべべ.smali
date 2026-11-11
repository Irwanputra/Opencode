.class public Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/げつ〴ぬぐ$づざかべべ;
.super Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/げつ〴ぬぐ$ぁごぐすすぃ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/げつ〴ぬぐ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3065\u3056\u304b\u3079\u3079"
.end annotation


# instance fields
.field public final 〺つふすそ:Z

.field public final げつ〴ぬぐ:Landroid/animation/ObjectAnimator;


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/AnimationDrawable;ZZ)V
    .registers 9

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/げつ〴ぬぐ$ぁごぐすすぃ;-><init>(Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;)V

    invoke-virtual {p1}, Landroid/graphics/drawable/AnimationDrawable;->getNumberOfFrames()I

    move-result v0

    const/4 v1, 0x0

    if-eqz p2, :cond_e

    add-int/lit8 v2, v0, -0x1

    goto :goto_f

    :cond_e
    const/4 v2, 0x0

    :goto_f
    const/4 v3, 0x1

    if-eqz p2, :cond_14

    const/4 v0, 0x0

    goto :goto_15

    :cond_14
    sub-int/2addr v0, v3

    :goto_15
    new-instance v4, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/げつ〴ぬぐ$なぎぱいぢぎ;

    invoke-direct {v4, p1, p2}, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/げつ〴ぬぐ$なぎぱいぢぎ;-><init>(Landroid/graphics/drawable/AnimationDrawable;Z)V

    const/4 p2, 0x2

    new-array p2, p2, [I

    aput v2, p2, v1

    aput v0, p2, v3

    const-string v0, "currentIndex"

    invoke-static {p1, v0, p2}, Landroid/animation/ObjectAnimator;->ofInt(Ljava/lang/Object;Ljava/lang/String;[I)Landroid/animation/ObjectAnimator;

    move-result-object p1

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x12

    if-lt p2, v0, :cond_30

    invoke-virtual {p1, v3}, Landroid/animation/ObjectAnimator;->setAutoCancel(Z)V

    .line 1
    :cond_30
    iget p2, v4, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/げつ〴ぬぐ$なぎぱいぢぎ;->くし〴〺ぅ:I

    int-to-long v0, p2

    .line 2
    invoke-virtual {p1, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    invoke-virtual {p1, v4}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    iput-boolean p3, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/げつ〴ぬぐ$づざかべべ;->〺つふすそ:Z

    iput-object p1, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/げつ〴ぬぐ$づざかべべ;->げつ〴ぬぐ:Landroid/animation/ObjectAnimator;

    return-void
.end method


# virtual methods
.method public 〺つふすそ()V
    .registers 2

    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/げつ〴ぬぐ$づざかべべ;->げつ〴ぬぐ:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->reverse()V

    return-void
.end method

.method public くし〴〺ぅ()V
    .registers 2

    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/げつ〴ぬぐ$づざかべべ;->げつ〴ぬぐ:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    return-void
.end method

.method public げつ〴ぬぐ()Z
    .registers 2

    iget-boolean v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/げつ〴ぬぐ$づざかべべ;->〺つふすそ:Z

    return v0
.end method

.method public びぐびあび()V
    .registers 2

    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/げつ〴ぬぐ$づざかべべ;->げつ〴ぬぐ:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->cancel()V

    return-void
.end method
