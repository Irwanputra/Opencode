.class public Landroidx/viewpager2/widget/ViewPager2$くし〴〺ぅ;
.super Landroidx/viewpager2/widget/ViewPager2$ぁごぐすすぃ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/viewpager2/widget/ViewPager2;->げつ〴ぬぐ(Landroid/content/Context;Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic げつ〴ぬぐ:Landroidx/viewpager2/widget/ViewPager2;


# direct methods
.method public constructor <init>(Landroidx/viewpager2/widget/ViewPager2;)V
    .registers 2

    iput-object p1, p0, Landroidx/viewpager2/widget/ViewPager2$くし〴〺ぅ;->げつ〴ぬぐ:Landroidx/viewpager2/widget/ViewPager2;

    invoke-direct {p0}, Landroidx/viewpager2/widget/ViewPager2$ぁごぐすすぃ;-><init>()V

    return-void
.end method


# virtual methods
.method public くし〴〺ぅ(I)V
    .registers 3

    iget-object p1, p0, Landroidx/viewpager2/widget/ViewPager2$くし〴〺ぅ;->げつ〴ぬぐ:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->clearFocus()V

    iget-object p1, p0, Landroidx/viewpager2/widget/ViewPager2$くし〴〺ぅ;->げつ〴ぬぐ:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->hasFocus()Z

    move-result p1

    if-eqz p1, :cond_15

    iget-object p1, p0, Landroidx/viewpager2/widget/ViewPager2$くし〴〺ぅ;->げつ〴ぬぐ:Landroidx/viewpager2/widget/ViewPager2;

    iget-object p1, p1, Landroidx/viewpager2/widget/ViewPager2;->ぺふねづ〺:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->requestFocus(I)Z

    :cond_15
    return-void
.end method
