.class public Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/〺つふすそ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic 〺つふすそ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;

.field public final synthetic げつ〴ぬぐ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;


# direct methods
.method public constructor <init>(Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;)V
    .registers 3

    iput-object p1, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;

    iput-object p2, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/〺つふすそ;->げつ〴ぬぐ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .registers 5

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;

    iget-object v1, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/〺つふすそ;->げつ〴ぬぐ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;

    invoke-virtual {v0, p1, v1}, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->びぐびあび(FLづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;)V

    iget-object v0, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;

    iget-object v1, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/〺つふすそ;->げつ〴ぬぐ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->げつ〴ぬぐ(FLづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;Z)V

    iget-object p1, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method
