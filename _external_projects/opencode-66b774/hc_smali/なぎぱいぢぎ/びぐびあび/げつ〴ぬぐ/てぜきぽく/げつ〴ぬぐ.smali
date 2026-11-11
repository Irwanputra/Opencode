.class public Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/てぜきぽく/げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# instance fields
.field public final synthetic げつ〴ぬぐ:Lcom/codetroopers/betterpickers/numberpicker/NumberPickerErrorTextView;


# direct methods
.method public constructor <init>(Lcom/codetroopers/betterpickers/numberpicker/NumberPickerErrorTextView;)V
    .registers 2

    iput-object p1, p0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/てぜきぽく/げつ〴ぬぐ;->げつ〴ぬぐ:Lcom/codetroopers/betterpickers/numberpicker/NumberPickerErrorTextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .registers 3

    iget-object p1, p0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/てぜきぽく/げつ〴ぬぐ;->げつ〴ぬぐ:Lcom/codetroopers/betterpickers/numberpicker/NumberPickerErrorTextView;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .registers 2

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .registers 2

    return-void
.end method
