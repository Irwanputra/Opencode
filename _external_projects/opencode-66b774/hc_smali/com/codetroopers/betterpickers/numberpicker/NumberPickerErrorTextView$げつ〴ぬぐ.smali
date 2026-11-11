.class public Lcom/codetroopers/betterpickers/numberpicker/NumberPickerErrorTextView$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/codetroopers/betterpickers/numberpicker/NumberPickerErrorTextView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lcom/codetroopers/betterpickers/numberpicker/NumberPickerErrorTextView;


# direct methods
.method public constructor <init>(Lcom/codetroopers/betterpickers/numberpicker/NumberPickerErrorTextView;)V
    .registers 2

    iput-object p1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPickerErrorTextView$げつ〴ぬぐ;->〺つふすそ:Lcom/codetroopers/betterpickers/numberpicker/NumberPickerErrorTextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 4

    iget-object v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPickerErrorTextView$げつ〴ぬぐ;->〺つふすそ:Lcom/codetroopers/betterpickers/numberpicker/NumberPickerErrorTextView;

    .line 1
    iget-object v1, v0, Lcom/codetroopers/betterpickers/numberpicker/NumberPickerErrorTextView;->くし〴〺ぅ:Landroid/os/Handler;

    iget-object v2, v0, Lcom/codetroopers/betterpickers/numberpicker/NumberPickerErrorTextView;->〺つふすそ:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x10a0001

    invoke-static {v1, v2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v1

    new-instance v2, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/てぜきぽく/げつ〴ぬぐ;

    invoke-direct {v2, v0}, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/てぜきぽく/げつ〴ぬぐ;-><init>(Lcom/codetroopers/betterpickers/numberpicker/NumberPickerErrorTextView;)V

    invoke-virtual {v1, v2}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method
