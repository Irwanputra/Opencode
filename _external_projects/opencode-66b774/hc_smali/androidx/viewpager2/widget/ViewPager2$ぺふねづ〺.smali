.class public Landroidx/viewpager2/widget/ViewPager2$ぺふねづ〺;
.super Landroidx/recyclerview/widget/RecyclerView;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/viewpager2/widget/ViewPager2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u307a\u3075\u306d\u3065\u303a"
.end annotation


# instance fields
.field public final synthetic 〱〴なぱへて:Landroidx/viewpager2/widget/ViewPager2;


# direct methods
.method public constructor <init>(Landroidx/viewpager2/widget/ViewPager2;Landroid/content/Context;)V
    .registers 3

    iput-object p1, p0, Landroidx/viewpager2/widget/ViewPager2$ぺふねづ〺;->〱〴なぱへて:Landroidx/viewpager2/widget/ViewPager2;

    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public getAccessibilityClassName()Ljava/lang/CharSequence;
    .registers 2

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2$ぺふねづ〺;->〱〴なぱへて:Landroidx/viewpager2/widget/ViewPager2;

    iget-object v0, v0, Landroidx/viewpager2/widget/ViewPager2;->ざっざへづ:Landroidx/viewpager2/widget/ViewPager2$びぐびあび;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-super {p0}, Landroidx/recyclerview/widget/RecyclerView;->getAccessibilityClassName()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .registers 3

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2$ぺふねづ〺;->〱〴なぱへて:Landroidx/viewpager2/widget/ViewPager2;

    iget v0, v0, Landroidx/viewpager2/widget/ViewPager2;->づざかべべ:I

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setFromIndex(I)V

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2$ぺふねづ〺;->〱〴なぱへて:Landroidx/viewpager2/widget/ViewPager2;

    iget v0, v0, Landroidx/viewpager2/widget/ViewPager2;->づざかべべ:I

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setToIndex(I)V

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2$ぺふねづ〺;->〱〴なぱへて:Landroidx/viewpager2/widget/ViewPager2;

    iget-object v0, v0, Landroidx/viewpager2/widget/ViewPager2;->ざっざへづ:Landroidx/viewpager2/widget/ViewPager2$びぐびあび;

    check-cast v0, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;

    .line 1
    iget-object v0, v0, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;->びぐびあび:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setSource(Landroid/view/View;)V

    const-string v0, "androidx.viewpager.widget.ViewPager"

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 3

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2$ぺふねづ〺;->〱〴なぱへて:Landroidx/viewpager2/widget/ViewPager2;

    .line 1
    iget-boolean v0, v0, Landroidx/viewpager2/widget/ViewPager2;->は〲ぱなで:Z

    if-eqz v0, :cond_e

    .line 2
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    if-eqz p1, :cond_e

    const/4 p1, 0x1

    goto :goto_f

    :cond_e
    const/4 p1, 0x0

    :goto_f
    return p1
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2$ぺふねづ〺;->〱〴なぱへて:Landroidx/viewpager2/widget/ViewPager2;

    .line 1
    iget-boolean v0, v0, Landroidx/viewpager2/widget/ViewPager2;->は〲ぱなで:Z

    if-eqz v0, :cond_e

    .line 2
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    if-eqz p1, :cond_e

    const/4 p1, 0x1

    goto :goto_f

    :cond_e
    const/4 p1, 0x0

    :goto_f
    return p1
.end method
