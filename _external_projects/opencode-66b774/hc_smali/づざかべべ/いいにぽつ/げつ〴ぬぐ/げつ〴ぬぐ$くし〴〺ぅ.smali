.class public Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ$くし〴〺ぅ;
.super Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/くし〴〺ぅ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u304f\u3057\u3034\u303a\u3045"
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ;


# direct methods
.method public constructor <init>(Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ;)V
    .registers 2

    iput-object p1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ$くし〴〺ぅ;->〺つふすそ:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ;

    invoke-direct {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/くし〴〺ぅ;-><init>()V

    return-void
.end method


# virtual methods
.method public 〺つふすそ(I)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;
    .registers 3

    const/4 v0, 0x2

    if-ne p1, v0, :cond_8

    iget-object p1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ$くし〴〺ぅ;->〺つふすそ:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ;

    iget p1, p1, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺふねづ〺:I

    goto :goto_c

    :cond_8
    iget-object p1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ$くし〴〺ぅ;->〺つふすそ:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ;

    iget p1, p1, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ;->てぜきぽく:I

    :goto_c
    const/high16 v0, -0x80000000

    if-ne p1, v0, :cond_12

    const/4 p1, 0x0

    return-object p1

    .line 1
    :cond_12
    iget-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ$くし〴〺ぅ;->〺つふすそ:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ;

    invoke-virtual {v0, p1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ;->は〲ぱなで(I)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;

    move-result-object p1

    .line 2
    iget-object p1, p1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->げつ〴ぬぐ:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain(Landroid/view/accessibility/AccessibilityNodeInfo;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object p1

    .line 3
    new-instance v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;

    invoke-direct {v0, p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    return-object v0
.end method

.method public くし〴〺ぅ(IILandroid/os/Bundle;)Z
    .registers 8

    iget-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ$くし〴〺ぅ;->〺つふすそ:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ;

    const/4 v1, 0x0

    const/4 v2, -0x1

    if-eq p1, v2, :cond_54

    const/4 v2, 0x1

    if-eq p2, v2, :cond_4f

    const/4 v3, 0x2

    if-eq p2, v3, :cond_4a

    const/16 v3, 0x40

    if-eq p2, v3, :cond_1e

    const/16 v1, 0x80

    if-eq p2, v1, :cond_19

    .line 1
    invoke-virtual {v0, p1, p2, p3}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ;->ごづごきえ(IILandroid/os/Bundle;)Z

    move-result p1

    goto :goto_63

    :cond_19
    invoke-virtual {v0, p1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ;->いいにぽつ(I)Z

    move-result p1

    goto :goto_63

    .line 2
    :cond_1e
    iget-object p2, v0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ;->〳ぜぞぜべっ:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result p2

    if-eqz p2, :cond_48

    iget-object p2, v0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ;->〳ぜぞぜべっ:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    move-result p2

    if-nez p2, :cond_2f

    goto :goto_48

    :cond_2f
    iget p2, v0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺふねづ〺:I

    if-eq p2, p1, :cond_48

    const/high16 p3, -0x80000000

    if-eq p2, p3, :cond_3a

    invoke-virtual {v0, p2}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ;->いいにぽつ(I)Z

    :cond_3a
    iput p1, v0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺふねづ〺:I

    iget-object p2, v0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->invalidate()V

    const p2, 0x8000

    invoke-virtual {v0, p1, p2}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ;->ぇ〳〲〺すっ(II)Z

    const/4 v1, 0x1

    :cond_48
    :goto_48
    move p1, v1

    goto :goto_63

    .line 3
    :cond_4a
    invoke-virtual {v0, p1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺふねづ〺(I)Z

    move-result p1

    goto :goto_63

    :cond_4f
    invoke-virtual {v0, p1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ;->ぉ〲なぱぽた(I)Z

    move-result p1

    goto :goto_63

    .line 4
    :cond_54
    iget-object p1, v0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ:Landroid/view/View;

    .line 5
    sget-object v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->げつ〴ぬぐ:Ljava/util/concurrent/atomic/AtomicInteger;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x10

    if-lt v0, v2, :cond_48

    invoke-virtual {p1, p2, p3}, Landroid/view/View;->performAccessibilityAction(ILandroid/os/Bundle;)Z

    move-result v1

    goto :goto_48

    :goto_63
    return p1
.end method

.method public げつ〴ぬぐ(I)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;
    .registers 3

    iget-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ$くし〴〺ぅ;->〺つふすそ:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ;

    invoke-virtual {v0, p1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ;->は〲ぱなで(I)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;

    move-result-object p1

    .line 1
    iget-object p1, p1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->げつ〴ぬぐ:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain(Landroid/view/accessibility/AccessibilityNodeInfo;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object p1

    .line 2
    new-instance v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;

    invoke-direct {v0, p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    return-object v0
.end method
