.class public Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$いいにぽつ;
.super Landroidx/appcompat/widget/ContentFrameLayout;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u3044\u3044\u306b\u307d\u3064"
.end annotation


# instance fields
.field public final synthetic いいにぽつ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;


# direct methods
.method public constructor <init>(Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;Landroid/content/Context;)V
    .registers 3

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$いいにぽつ;->いいにぽつ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    invoke-direct {p0, p2}, Landroidx/appcompat/widget/ContentFrameLayout;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .registers 3

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$いいにぽつ;->いいにぽつ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ぷぞてのほき(Landroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_11

    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_f

    goto :goto_11

    :cond_f
    const/4 p1, 0x0

    goto :goto_12

    :cond_11
    :goto_11
    const/4 p1, 0x1

    :goto_12
    return p1
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 7

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_37

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    float-to-int v1, v1

    const/4 v2, -0x5

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-lt v0, v2, :cond_2a

    if-lt v1, v2, :cond_2a

    .line 1
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getWidth()I

    move-result v2

    add-int/lit8 v2, v2, 0x5

    if-gt v0, v2, :cond_2a

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v0

    add-int/lit8 v0, v0, 0x5

    if-le v1, v0, :cond_28

    goto :goto_2a

    :cond_28
    const/4 v0, 0x0

    goto :goto_2b

    :cond_2a
    :goto_2a
    const/4 v0, 0x1

    :goto_2b
    if-eqz v0, :cond_37

    .line 2
    iget-object p1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$いいにぽつ;->いいにぽつ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    .line 3
    invoke-virtual {p1, v3}, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ておぞぞはね(I)Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$ぺふねづ〺;

    move-result-object v0

    invoke-virtual {p1, v0, v4}, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ぉひのべい(Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$ぺふねづ〺;Z)V

    return v4

    .line 4
    :cond_37
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public setBackgroundResource(I)V
    .registers 3

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lづざかべべ/〺つふすそ/てぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method
