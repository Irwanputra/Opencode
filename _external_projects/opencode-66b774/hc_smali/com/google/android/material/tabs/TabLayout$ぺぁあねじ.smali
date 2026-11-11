.class public Lcom/google/android/material/tabs/TabLayout$ぺぁあねじ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/material/tabs/TabLayout$びぐびあび;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/tabs/TabLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u307a\u3041\u3042\u306d\u3058"
.end annotation


# instance fields
.field public final げつ〴ぬぐ:Landroidx/viewpager/widget/ViewPager;


# direct methods
.method public constructor <init>(Landroidx/viewpager/widget/ViewPager;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/tabs/TabLayout$ぺぁあねじ;->げつ〴ぬぐ:Landroidx/viewpager/widget/ViewPager;

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Lcom/google/android/material/tabs/TabLayout$ぁごぐすすぃ;)V
    .registers 2

    return-void
.end method

.method public くし〴〺ぅ(Lcom/google/android/material/tabs/TabLayout$ぁごぐすすぃ;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout$ぺぁあねじ;->げつ〴ぬぐ:Landroidx/viewpager/widget/ViewPager;

    .line 1
    iget p1, p1, Lcom/google/android/material/tabs/TabLayout$ぁごぐすすぃ;->びぐびあび:I

    .line 2
    invoke-virtual {v0, p1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    return-void
.end method

.method public げつ〴ぬぐ(Lcom/google/android/material/tabs/TabLayout$ぁごぐすすぃ;)V
    .registers 2

    return-void
.end method
