.class public Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ;


# direct methods
.method public constructor <init>(Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ;)V
    .registers 2

    iput-object p1, p0, Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ$げつ〴ぬぐ;->〺つふすそ:Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 15

    iget-object v0, p0, Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ$げつ〴ぬぐ;->〺つふすそ:Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ;

    .line 1
    iget-object v1, v0, Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ;->〺つふすそ:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;

    .line 2
    iget v1, v1, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->おぐぴう〸ず:I

    .line 3
    iget v2, v0, Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ;->げつ〴ぬぐ:I

    const/4 v3, 0x3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-ne v2, v3, :cond_f

    const/4 v2, 0x1

    goto :goto_10

    :cond_f
    const/4 v2, 0x0

    :goto_10
    if-eqz v2, :cond_23

    iget-object v6, v0, Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ;->びぐびあび:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {v6, v3}, Landroidx/drawerlayout/widget/DrawerLayout;->づざかべべ(I)Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_20

    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v6

    neg-int v6, v6

    goto :goto_21

    :cond_20
    const/4 v6, 0x0

    :goto_21
    add-int/2addr v6, v1

    goto :goto_31

    :cond_23
    iget-object v3, v0, Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ;->びぐびあび:Landroidx/drawerlayout/widget/DrawerLayout;

    const/4 v6, 0x5

    invoke-virtual {v3, v6}, Landroidx/drawerlayout/widget/DrawerLayout;->づざかべべ(I)Landroid/view/View;

    move-result-object v3

    iget-object v6, v0, Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ;->びぐびあび:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {v6}, Landroid/view/ViewGroup;->getWidth()I

    move-result v6

    sub-int/2addr v6, v1

    :goto_31
    if-eqz v3, :cond_8c

    if-eqz v2, :cond_3b

    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    move-result v1

    if-lt v1, v6, :cond_43

    :cond_3b
    if-nez v2, :cond_8c

    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    move-result v1

    if-le v1, v6, :cond_8c

    :cond_43
    iget-object v1, v0, Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ;->びぐびあび:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {v1, v3}, Landroidx/drawerlayout/widget/DrawerLayout;->ぺぁあねじ(Landroid/view/View;)I

    move-result v1

    if-nez v1, :cond_8c

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;

    iget-object v2, v0, Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ;->〺つふすそ:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;

    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    move-result v7

    invoke-virtual {v2, v3, v6, v7}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぇ〳〲〺すっ(Landroid/view/View;II)Z

    iput-boolean v4, v1, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->くし〴〺ぅ:Z

    iget-object v1, v0, Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ;->びぐびあび:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->invalidate()V

    invoke-virtual {v0}, Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ;->のぷのちつ()V

    iget-object v0, v0, Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ;->びぐびあび:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 4
    iget-boolean v1, v0, Landroidx/drawerlayout/widget/DrawerLayout;->は〲ぱなで:Z

    if-nez v1, :cond_8c

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v8

    const/4 v10, 0x3

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-wide v6, v8

    invoke-static/range {v6 .. v13}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v1

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    :goto_7b
    if-ge v5, v2, :cond_87

    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_7b

    :cond_87
    invoke-virtual {v1}, Landroid/view/MotionEvent;->recycle()V

    iput-boolean v4, v0, Landroidx/drawerlayout/widget/DrawerLayout;->は〲ぱなで:Z

    :cond_8c
    return-void
.end method
