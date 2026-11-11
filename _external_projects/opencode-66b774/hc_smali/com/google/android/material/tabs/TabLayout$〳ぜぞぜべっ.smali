.class public Lcom/google/android/material/tabs/TabLayout$〳ぜぞぜべっ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$ぺぁあねじ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/tabs/TabLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3033\u305c\u305e\u305c\u3079\u3063"
.end annotation


# instance fields
.field public final 〺つふすそ:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/google/android/material/tabs/TabLayout;",
            ">;"
        }
    .end annotation
.end field

.field public くし〴〺ぅ:I

.field public びぐびあび:I


# direct methods
.method public constructor <init>(Lcom/google/android/material/tabs/TabLayout;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/android/material/tabs/TabLayout$〳ぜぞぜべっ;->〺つふすそ:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public 〺つふすそ(I)V
    .registers 3

    iget v0, p0, Lcom/google/android/material/tabs/TabLayout$〳ぜぞぜべっ;->びぐびあび:I

    iput v0, p0, Lcom/google/android/material/tabs/TabLayout$〳ぜぞぜべっ;->くし〴〺ぅ:I

    iput p1, p0, Lcom/google/android/material/tabs/TabLayout$〳ぜぞぜべっ;->びぐびあび:I

    return-void
.end method

.method public くし〴〺ぅ(I)V
    .registers 5

    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout$〳ぜぞぜべっ;->〺つふすそ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/tabs/TabLayout;

    if-eqz v0, :cond_2c

    invoke-virtual {v0}, Lcom/google/android/material/tabs/TabLayout;->getSelectedTabPosition()I

    move-result v1

    if-eq v1, p1, :cond_2c

    invoke-virtual {v0}, Lcom/google/android/material/tabs/TabLayout;->getTabCount()I

    move-result v1

    if-ge p1, v1, :cond_2c

    iget v1, p0, Lcom/google/android/material/tabs/TabLayout$〳ぜぞぜべっ;->びぐびあび:I

    if-eqz v1, :cond_24

    const/4 v2, 0x2

    if-ne v1, v2, :cond_22

    iget v1, p0, Lcom/google/android/material/tabs/TabLayout$〳ぜぞぜべっ;->くし〴〺ぅ:I

    if-nez v1, :cond_22

    goto :goto_24

    :cond_22
    const/4 v1, 0x0

    goto :goto_25

    :cond_24
    :goto_24
    const/4 v1, 0x1

    :goto_25
    invoke-virtual {v0, p1}, Lcom/google/android/material/tabs/TabLayout;->〳ぜぞぜべっ(I)Lcom/google/android/material/tabs/TabLayout$ぁごぐすすぃ;

    move-result-object p1

    invoke-virtual {v0, p1, v1}, Lcom/google/android/material/tabs/TabLayout;->ぺふねづ〺(Lcom/google/android/material/tabs/TabLayout$ぁごぐすすぃ;Z)V

    :cond_2c
    return-void
.end method

.method public げつ〴ぬぐ(IFI)V
    .registers 9

    iget-object p3, p0, Lcom/google/android/material/tabs/TabLayout$〳ぜぞぜべっ;->〺つふすそ:Ljava/lang/ref/WeakReference;

    invoke-virtual {p3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/google/android/material/tabs/TabLayout;

    if-eqz p3, :cond_23

    iget v0, p0, Lcom/google/android/material/tabs/TabLayout$〳ぜぞぜべっ;->びぐびあび:I

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-ne v0, v2, :cond_18

    iget v4, p0, Lcom/google/android/material/tabs/TabLayout$〳ぜぞぜべっ;->くし〴〺ぅ:I

    if-ne v4, v3, :cond_16

    goto :goto_18

    :cond_16
    const/4 v4, 0x0

    goto :goto_19

    :cond_18
    :goto_18
    const/4 v4, 0x1

    :goto_19
    if-ne v0, v2, :cond_1f

    iget v0, p0, Lcom/google/android/material/tabs/TabLayout$〳ぜぞぜべっ;->くし〴〺ぅ:I

    if-eqz v0, :cond_20

    :cond_1f
    const/4 v1, 0x1

    :cond_20
    invoke-virtual {p3, p1, p2, v4, v1}, Lcom/google/android/material/tabs/TabLayout;->setScrollPosition(IFZZ)V

    :cond_23
    return-void
.end method
