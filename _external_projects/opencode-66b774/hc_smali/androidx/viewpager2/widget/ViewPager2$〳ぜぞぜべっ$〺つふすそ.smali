.class public Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ$〺つふすそ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/びぐびあび;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic げつ〴ぬぐ:Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;


# direct methods
.method public constructor <init>(Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;)V
    .registers 2

    iput-object p1, p0, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ$〺つふすそ;->げつ〴ぬぐ:Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ(Landroid/view/View;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/びぐびあび$げつ〴ぬぐ;)Z
    .registers 4

    check-cast p1, Landroidx/viewpager2/widget/ViewPager2;

    iget-object p2, p0, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ$〺つふすそ;->げつ〴ぬぐ:Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;

    invoke-virtual {p1}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    move-result p1

    const/4 v0, 0x1

    sub-int/2addr p1, v0

    invoke-virtual {p2, p1}, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;->くし〴〺ぅ(I)V

    return v0
.end method
