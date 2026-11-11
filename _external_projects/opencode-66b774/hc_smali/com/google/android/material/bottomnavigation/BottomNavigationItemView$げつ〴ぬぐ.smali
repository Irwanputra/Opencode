.class public Lcom/google/android/material/bottomnavigation/BottomNavigationItemView$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic げつ〴ぬぐ:Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;


# direct methods
.method public constructor <init>(Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationItemView$げつ〴ぬぐ;->げつ〴ぬぐ:Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLayoutChange(Landroid/view/View;IIIIIIII)V
    .registers 10

    iget-object p1, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationItemView$げつ〴ぬぐ;->げつ〴ぬぐ:Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;

    .line 1
    iget-object p1, p1, Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;->〳ぜぞぜべっ:Landroid/widget/ImageView;

    .line 2
    invoke-virtual {p1}, Landroid/widget/ImageView;->getVisibility()I

    move-result p1

    if-nez p1, :cond_1e

    iget-object p1, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationItemView$げつ〴ぬぐ;->げつ〴ぬぐ:Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;

    .line 3
    iget-object p2, p1, Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;->〳ぜぞぜべっ:Landroid/widget/ImageView;

    .line 4
    invoke-virtual {p1}, Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;->くし〴〺ぅ()Z

    move-result p3

    if-nez p3, :cond_15

    goto :goto_1e

    :cond_15
    iget-object p3, p1, Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;->ぇぬぎばつ:Lcom/google/android/material/badge/BadgeDrawable;

    invoke-virtual {p1, p2}, Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;->〺つふすそ(Landroid/view/View;)Landroid/widget/FrameLayout;

    move-result-object p1

    invoke-static {p3, p2, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おぐぴう〸ず/げつ〴ぬぐ;->〺つふすそ(Lcom/google/android/material/badge/BadgeDrawable;Landroid/view/View;Landroid/widget/FrameLayout;)V

    :cond_1e
    :goto_1e
    return-void
.end method
