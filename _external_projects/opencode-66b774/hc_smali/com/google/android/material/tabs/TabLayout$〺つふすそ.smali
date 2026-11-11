.class public Lcom/google/android/material/tabs/TabLayout$〺つふすそ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$〳ぜぞぜべっ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/tabs/TabLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u303a\u3064\u3075\u3059\u305d"
.end annotation


# instance fields
.field public 〺つふすそ:Z

.field public final synthetic くし〴〺ぅ:Lcom/google/android/material/tabs/TabLayout;


# direct methods
.method public constructor <init>(Lcom/google/android/material/tabs/TabLayout;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/material/tabs/TabLayout$〺つふすそ;->くし〴〺ぅ:Lcom/google/android/material/tabs/TabLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public びぐびあび(Landroidx/viewpager/widget/ViewPager;Lづざかべべ/でどあくず/げつ〴ぬぐ/げつ〴ぬぐ;Lづざかべべ/でどあくず/げつ〴ぬぐ/げつ〴ぬぐ;)V
    .registers 5

    iget-object p2, p0, Lcom/google/android/material/tabs/TabLayout$〺つふすそ;->くし〴〺ぅ:Lcom/google/android/material/tabs/TabLayout;

    iget-object v0, p2, Lcom/google/android/material/tabs/TabLayout;->ぷぞてのほき:Landroidx/viewpager/widget/ViewPager;

    if-ne v0, p1, :cond_b

    iget-boolean p1, p0, Lcom/google/android/material/tabs/TabLayout$〺つふすそ;->〺つふすそ:Z

    invoke-virtual {p2, p3, p1}, Lcom/google/android/material/tabs/TabLayout;->てぜきぽく(Lづざかべべ/でどあくず/げつ〴ぬぐ/げつ〴ぬぐ;Z)V

    :cond_b
    return-void
.end method
