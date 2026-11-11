.class public Lcom/google/android/material/bottomnavigation/BottomNavigationView$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ$げつ〴ぬぐ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/bottomnavigation/BottomNavigationView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lcom/google/android/material/bottomnavigation/BottomNavigationView;


# direct methods
.method public constructor <init>(Lcom/google/android/material/bottomnavigation/BottomNavigationView;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationView$げつ〴ぬぐ;->〺つふすそ:Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;)V
    .registers 2

    return-void
.end method

.method public げつ〴ぬぐ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;Landroid/view/MenuItem;)Z
    .registers 5

    iget-object p1, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationView$げつ〴ぬぐ;->〺つふすそ:Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 1
    iget-object p1, p1, Lcom/google/android/material/bottomnavigation/BottomNavigationView;->〳ぜぞぜべっ:Lcom/google/android/material/bottomnavigation/BottomNavigationView$〺つふすそ;

    const/4 v0, 0x1

    if-eqz p1, :cond_1b

    .line 2
    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    iget-object v1, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationView$げつ〴ぬぐ;->〺つふすそ:Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    invoke-virtual {v1}, Lcom/google/android/material/bottomnavigation/BottomNavigationView;->getSelectedItemId()I

    move-result v1

    if-ne p1, v1, :cond_1b

    iget-object p1, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationView$げつ〴ぬぐ;->〺つふすそ:Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 3
    iget-object p1, p1, Lcom/google/android/material/bottomnavigation/BottomNavigationView;->〳ぜぞぜべっ:Lcom/google/android/material/bottomnavigation/BottomNavigationView$〺つふすそ;

    .line 4
    invoke-interface {p1, p2}, Lcom/google/android/material/bottomnavigation/BottomNavigationView$〺つふすそ;->げつ〴ぬぐ(Landroid/view/MenuItem;)V

    return v0

    :cond_1b
    iget-object p1, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationView$げつ〴ぬぐ;->〺つふすそ:Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 5
    iget-object p1, p1, Lcom/google/android/material/bottomnavigation/BottomNavigationView;->ぁごぐすすぃ:Lcom/google/android/material/bottomnavigation/BottomNavigationView$くし〴〺ぅ;

    if-eqz p1, :cond_28

    .line 6
    invoke-interface {p1, p2}, Lcom/google/android/material/bottomnavigation/BottomNavigationView$くし〴〺ぅ;->げつ〴ぬぐ(Landroid/view/MenuItem;)Z

    move-result p1

    if-nez p1, :cond_28

    goto :goto_29

    :cond_28
    const/4 v0, 0x0

    :goto_29
    return v0
.end method
