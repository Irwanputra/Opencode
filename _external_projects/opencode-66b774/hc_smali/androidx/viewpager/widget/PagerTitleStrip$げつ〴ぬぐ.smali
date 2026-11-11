.class public Landroidx/viewpager/widget/PagerTitleStrip$げつ〴ぬぐ;
.super Landroid/database/DataSetObserver;
.source ""

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$ぺぁあねじ;
.implements Landroidx/viewpager/widget/ViewPager$〳ぜぞぜべっ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/viewpager/widget/PagerTitleStrip;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# instance fields
.field public 〺つふすそ:I

.field public final synthetic くし〴〺ぅ:Landroidx/viewpager/widget/PagerTitleStrip;


# direct methods
.method public constructor <init>(Landroidx/viewpager/widget/PagerTitleStrip;)V
    .registers 2

    iput-object p1, p0, Landroidx/viewpager/widget/PagerTitleStrip$げつ〴ぬぐ;->くし〴〺ぅ:Landroidx/viewpager/widget/PagerTitleStrip;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public onChanged()V
    .registers 5

    iget-object v0, p0, Landroidx/viewpager/widget/PagerTitleStrip$げつ〴ぬぐ;->くし〴〺ぅ:Landroidx/viewpager/widget/PagerTitleStrip;

    iget-object v1, v0, Landroidx/viewpager/widget/PagerTitleStrip;->〺つふすそ:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v1}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result v1

    iget-object v2, p0, Landroidx/viewpager/widget/PagerTitleStrip$げつ〴ぬぐ;->くし〴〺ぅ:Landroidx/viewpager/widget/PagerTitleStrip;

    iget-object v2, v2, Landroidx/viewpager/widget/PagerTitleStrip;->〺つふすそ:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v2}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Lづざかべべ/でどあくず/げつ〴ぬぐ/げつ〴ぬぐ;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroidx/viewpager/widget/PagerTitleStrip;->〺つふすそ(ILづざかべべ/でどあくず/げつ〴ぬぐ/げつ〴ぬぐ;)V

    iget-object v0, p0, Landroidx/viewpager/widget/PagerTitleStrip$げつ〴ぬぐ;->くし〴〺ぅ:Landroidx/viewpager/widget/PagerTitleStrip;

    iget v1, v0, Landroidx/viewpager/widget/PagerTitleStrip;->ぁごぐすすぃ:F

    const/4 v2, 0x0

    cmpl-float v3, v1, v2

    if-ltz v3, :cond_1d

    goto :goto_1e

    :cond_1d
    const/4 v1, 0x0

    :goto_1e
    iget-object v2, v0, Landroidx/viewpager/widget/PagerTitleStrip;->〺つふすそ:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v2}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result v2

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v1, v3}, Landroidx/viewpager/widget/PagerTitleStrip;->くし〴〺ぅ(IFZ)V

    return-void
.end method

.method public 〺つふすそ(I)V
    .registers 2

    iput p1, p0, Landroidx/viewpager/widget/PagerTitleStrip$げつ〴ぬぐ;->〺つふすそ:I

    return-void
.end method

.method public くし〴〺ぅ(I)V
    .registers 5

    iget p1, p0, Landroidx/viewpager/widget/PagerTitleStrip$げつ〴ぬぐ;->〺つふすそ:I

    if-nez p1, :cond_2c

    iget-object p1, p0, Landroidx/viewpager/widget/PagerTitleStrip$げつ〴ぬぐ;->くし〴〺ぅ:Landroidx/viewpager/widget/PagerTitleStrip;

    iget-object v0, p1, Landroidx/viewpager/widget/PagerTitleStrip;->〺つふすそ:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result v0

    iget-object v1, p0, Landroidx/viewpager/widget/PagerTitleStrip$げつ〴ぬぐ;->くし〴〺ぅ:Landroidx/viewpager/widget/PagerTitleStrip;

    iget-object v1, v1, Landroidx/viewpager/widget/PagerTitleStrip;->〺つふすそ:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v1}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Lづざかべべ/でどあくず/げつ〴ぬぐ/げつ〴ぬぐ;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroidx/viewpager/widget/PagerTitleStrip;->〺つふすそ(ILづざかべべ/でどあくず/げつ〴ぬぐ/げつ〴ぬぐ;)V

    iget-object p1, p0, Landroidx/viewpager/widget/PagerTitleStrip$げつ〴ぬぐ;->くし〴〺ぅ:Landroidx/viewpager/widget/PagerTitleStrip;

    iget v0, p1, Landroidx/viewpager/widget/PagerTitleStrip;->ぁごぐすすぃ:F

    const/4 v1, 0x0

    cmpl-float v2, v0, v1

    if-ltz v2, :cond_21

    goto :goto_22

    :cond_21
    const/4 v0, 0x0

    :goto_22
    iget-object v1, p1, Landroidx/viewpager/widget/PagerTitleStrip;->〺つふすそ:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v1}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {p1, v1, v0, v2}, Landroidx/viewpager/widget/PagerTitleStrip;->くし〴〺ぅ(IFZ)V

    :cond_2c
    return-void
.end method

.method public げつ〴ぬぐ(IFI)V
    .registers 5

    const/high16 p3, 0x3f000000    # 0.5f

    cmpl-float p3, p2, p3

    if-lez p3, :cond_8

    add-int/lit8 p1, p1, 0x1

    :cond_8
    iget-object p3, p0, Landroidx/viewpager/widget/PagerTitleStrip$げつ〴ぬぐ;->くし〴〺ぅ:Landroidx/viewpager/widget/PagerTitleStrip;

    const/4 v0, 0x0

    invoke-virtual {p3, p1, p2, v0}, Landroidx/viewpager/widget/PagerTitleStrip;->くし〴〺ぅ(IFZ)V

    return-void
.end method

.method public びぐびあび(Landroidx/viewpager/widget/ViewPager;Lづざかべべ/でどあくず/げつ〴ぬぐ/げつ〴ぬぐ;Lづざかべべ/でどあくず/げつ〴ぬぐ/げつ〴ぬぐ;)V
    .registers 4

    iget-object p1, p0, Landroidx/viewpager/widget/PagerTitleStrip$げつ〴ぬぐ;->くし〴〺ぅ:Landroidx/viewpager/widget/PagerTitleStrip;

    invoke-virtual {p1, p2, p3}, Landroidx/viewpager/widget/PagerTitleStrip;->げつ〴ぬぐ(Lづざかべべ/でどあくず/げつ〴ぬぐ/げつ〴ぬぐ;Lづざかべべ/でどあくず/げつ〴ぬぐ/げつ〴ぬぐ;)V

    return-void
.end method
