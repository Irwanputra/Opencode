.class public final Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/てぜきぽく;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final 〺つふすそ:Landroid/view/View;

.field public くし〴〺ぅ:Landroid/view/ViewTreeObserver;

.field public final びぐびあび:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Landroid/view/View;Ljava/lang/Runnable;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/てぜきぽく;->〺つふすそ:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    iput-object p1, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/てぜきぽく;->くし〴〺ぅ:Landroid/view/ViewTreeObserver;

    iput-object p2, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/てぜきぽく;->びぐびあび:Ljava/lang/Runnable;

    return-void
.end method

.method public static げつ〴ぬぐ(Landroid/view/View;Ljava/lang/Runnable;)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/てぜきぽく;
    .registers 3

    if-eqz p0, :cond_12

    new-instance v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/てぜきぽく;

    invoke-direct {v0, p0, p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/てぜきぽく;-><init>(Landroid/view/View;Ljava/lang/Runnable;)V

    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    invoke-virtual {p0, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    return-object v0

    :cond_12
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "view == null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public onPreDraw()Z
    .registers 2

    invoke-virtual {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/てぜきぽく;->〺つふすそ()V

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/てぜきぽく;->びぐびあび:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    const/4 v0, 0x1

    return v0
.end method

.method public onViewAttachedToWindow(Landroid/view/View;)V
    .registers 2

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    iput-object p1, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/てぜきぽく;->くし〴〺ぅ:Landroid/view/ViewTreeObserver;

    return-void
.end method

.method public onViewDetachedFromWindow(Landroid/view/View;)V
    .registers 2

    invoke-virtual {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/てぜきぽく;->〺つふすそ()V

    return-void
.end method

.method public 〺つふすそ()V
    .registers 2

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/てぜきぽく;->くし〴〺ぅ:Landroid/view/ViewTreeObserver;

    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/てぜきぽく;->くし〴〺ぅ:Landroid/view/ViewTreeObserver;

    goto :goto_11

    :cond_b
    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/てぜきぽく;->〺つふすそ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    :goto_11
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/てぜきぽく;->〺つふすそ:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    return-void
.end method
