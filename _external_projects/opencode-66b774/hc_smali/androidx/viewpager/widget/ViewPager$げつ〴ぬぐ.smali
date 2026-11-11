.class public final Landroidx/viewpager/widget/ViewPager$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/viewpager/widget/ViewPager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Landroidx/viewpager/widget/ViewPager$\u306a\u304e\u3071\u3044\u3062\u304e;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .registers 3

    check-cast p1, Landroidx/viewpager/widget/ViewPager$なぎぱいぢぎ;

    check-cast p2, Landroidx/viewpager/widget/ViewPager$なぎぱいぢぎ;

    .line 1
    iget p1, p1, Landroidx/viewpager/widget/ViewPager$なぎぱいぢぎ;->〺つふすそ:I

    iget p2, p2, Landroidx/viewpager/widget/ViewPager$なぎぱいぢぎ;->〺つふすそ:I

    sub-int/2addr p1, p2

    return p1
.end method
