.class public Landroidx/viewpager/widget/ViewPager$ぁごぐすすぃ;
.super Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/viewpager/widget/ViewPager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u3041\u3054\u3050\u3059\u3059\u3043"
.end annotation


# instance fields
.field public final synthetic びぐびあび:Landroidx/viewpager/widget/ViewPager;


# direct methods
.method public constructor <init>(Landroidx/viewpager/widget/ViewPager;)V
    .registers 2

    iput-object p1, p0, Landroidx/viewpager/widget/ViewPager$ぁごぐすすぃ;->びぐびあび:Landroidx/viewpager/widget/ViewPager;

    invoke-direct {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;-><init>()V

    return-void
.end method


# virtual methods
.method public ぁごぐすすぃ(Landroid/view/View;ILandroid/os/Bundle;)Z
    .registers 5

    invoke-super {p0, p1, p2, p3}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;->ぁごぐすすぃ(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result p1

    const/4 p3, 0x1

    if-eqz p1, :cond_8

    return p3

    :cond_8
    const/16 p1, 0x1000

    const/4 v0, 0x0

    if-eq p2, p1, :cond_25

    const/16 p1, 0x2000

    if-eq p2, p1, :cond_12

    return v0

    :cond_12
    iget-object p1, p0, Landroidx/viewpager/widget/ViewPager$ぁごぐすすぃ;->びぐびあび:Landroidx/viewpager/widget/ViewPager;

    const/4 p2, -0x1

    invoke-virtual {p1, p2}, Landroidx/viewpager/widget/ViewPager;->canScrollHorizontally(I)Z

    move-result p1

    if-eqz p1, :cond_24

    iget-object p1, p0, Landroidx/viewpager/widget/ViewPager$ぁごぐすすぃ;->びぐびあび:Landroidx/viewpager/widget/ViewPager;

    iget p2, p1, Landroidx/viewpager/widget/ViewPager;->ぁごぐすすぃ:I

    sub-int/2addr p2, p3

    :goto_20
    invoke-virtual {p1, p2}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    return p3

    :cond_24
    return v0

    :cond_25
    iget-object p1, p0, Landroidx/viewpager/widget/ViewPager$ぁごぐすすぃ;->びぐびあび:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p1, p3}, Landroidx/viewpager/widget/ViewPager;->canScrollHorizontally(I)Z

    move-result p1

    if-eqz p1, :cond_33

    iget-object p1, p0, Landroidx/viewpager/widget/ViewPager$ぁごぐすすぃ;->びぐびあび:Landroidx/viewpager/widget/ViewPager;

    iget p2, p1, Landroidx/viewpager/widget/ViewPager;->ぁごぐすすぃ:I

    add-int/2addr p2, p3

    goto :goto_20

    :cond_33
    return v0
.end method

.method public くし〴〺ぅ(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/view/View$AccessibilityDelegate;

    invoke-virtual {v0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 2
    const-class p1, Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V

    .line 3
    iget-object p1, p0, Landroidx/viewpager/widget/ViewPager$ぁごぐすすぃ;->びぐびあび:Landroidx/viewpager/widget/ViewPager;

    iget-object p1, p1, Landroidx/viewpager/widget/ViewPager;->なぎぱいぢぎ:Lづざかべべ/でどあくず/げつ〴ぬぐ/げつ〴ぬぐ;

    const/4 v0, 0x1

    if-eqz p1, :cond_1c

    invoke-virtual {p1}, Lづざかべべ/でどあくず/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ()I

    move-result p1

    if-le p1, v0, :cond_1c

    goto :goto_1d

    :cond_1c
    const/4 v0, 0x0

    .line 4
    :goto_1d
    invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityEvent;->setScrollable(Z)V

    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    move-result p1

    const/16 v0, 0x1000

    if-ne p1, v0, :cond_43

    iget-object p1, p0, Landroidx/viewpager/widget/ViewPager$ぁごぐすすぃ;->びぐびあび:Landroidx/viewpager/widget/ViewPager;

    iget-object p1, p1, Landroidx/viewpager/widget/ViewPager;->なぎぱいぢぎ:Lづざかべべ/でどあくず/げつ〴ぬぐ/げつ〴ぬぐ;

    if-eqz p1, :cond_43

    invoke-virtual {p1}, Lづざかべべ/でどあくず/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ()I

    move-result p1

    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityEvent;->setItemCount(I)V

    iget-object p1, p0, Landroidx/viewpager/widget/ViewPager$ぁごぐすすぃ;->びぐびあび:Landroidx/viewpager/widget/ViewPager;

    iget p1, p1, Landroidx/viewpager/widget/ViewPager;->ぁごぐすすぃ:I

    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityEvent;->setFromIndex(I)V

    iget-object p1, p0, Landroidx/viewpager/widget/ViewPager$ぁごぐすすぃ;->びぐびあび:Landroidx/viewpager/widget/ViewPager;

    iget p1, p1, Landroidx/viewpager/widget/ViewPager;->ぁごぐすすぃ:I

    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityEvent;->setToIndex(I)V

    :cond_43
    return-void
.end method

.method public びぐびあび(Landroid/view/View;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;)V
    .registers 5

    .line 1
    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/view/View$AccessibilityDelegate;

    .line 2
    iget-object v1, p2, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->げつ〴ぬぐ:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 3
    invoke-virtual {v0, p1, v1}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 4
    const-class p1, Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    .line 5
    iget-object v0, p2, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->げつ〴ぬぐ:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    .line 6
    iget-object p1, p0, Landroidx/viewpager/widget/ViewPager$ぁごぐすすぃ;->びぐびあび:Landroidx/viewpager/widget/ViewPager;

    iget-object p1, p1, Landroidx/viewpager/widget/ViewPager;->なぎぱいぢぎ:Lづざかべべ/でどあくず/げつ〴ぬぐ/げつ〴ぬぐ;

    const/4 v0, 0x1

    if-eqz p1, :cond_21

    invoke-virtual {p1}, Lづざかべべ/でどあくず/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ()I

    move-result p1

    if-le p1, v0, :cond_21

    const/4 p1, 0x1

    goto :goto_22

    :cond_21
    const/4 p1, 0x0

    .line 7
    :goto_22
    iget-object v1, p2, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->げつ〴ぬぐ:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v1, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setScrollable(Z)V

    .line 8
    iget-object p1, p0, Landroidx/viewpager/widget/ViewPager$ぁごぐすすぃ;->びぐびあび:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->canScrollHorizontally(I)Z

    move-result p1

    if-eqz p1, :cond_36

    const/16 p1, 0x1000

    .line 9
    iget-object v0, p2, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->げつ〴ぬぐ:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 10
    :cond_36
    iget-object p1, p0, Landroidx/viewpager/widget/ViewPager$ぁごぐすすぃ;->びぐびあび:Landroidx/viewpager/widget/ViewPager;

    const/4 v0, -0x1

    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->canScrollHorizontally(I)Z

    move-result p1

    if-eqz p1, :cond_46

    const/16 p1, 0x2000

    .line 11
    iget-object p2, p2, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->げつ〴ぬぐ:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    :cond_46
    return-void
.end method
