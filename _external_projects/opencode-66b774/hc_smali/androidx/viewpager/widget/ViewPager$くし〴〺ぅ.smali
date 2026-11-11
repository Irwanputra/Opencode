.class public Landroidx/viewpager/widget/ViewPager$くし〴〺ぅ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/viewpager/widget/ViewPager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Landroidx/viewpager/widget/ViewPager;


# direct methods
.method public constructor <init>(Landroidx/viewpager/widget/ViewPager;)V
    .registers 2

    iput-object p1, p0, Landroidx/viewpager/widget/ViewPager$くし〴〺ぅ;->〺つふすそ:Landroidx/viewpager/widget/ViewPager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 3

    iget-object v0, p0, Landroidx/viewpager/widget/ViewPager$くし〴〺ぅ;->〺つふすそ:Landroidx/viewpager/widget/ViewPager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->setScrollState(I)V

    iget-object v0, p0, Landroidx/viewpager/widget/ViewPager$くし〴〺ぅ;->〺つふすそ:Landroidx/viewpager/widget/ViewPager;

    .line 1
    iget v1, v0, Landroidx/viewpager/widget/ViewPager;->ぁごぐすすぃ:I

    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->でどあくず(I)V

    return-void
.end method
