.class public Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;


# direct methods
.method public constructor <init>(Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView$げつ〴ぬぐ;->〺つふすそ:Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .registers 5

    check-cast p1, Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;

    invoke-virtual {p1}, Lcom/google/android/material/bottomnavigation/BottomNavigationItemView;->getItemData()Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView$げつ〴ぬぐ;->〺つふすそ:Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;

    .line 1
    iget-object v1, v0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぇ〳〲〺すっ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    .line 2
    iget-object v0, v0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->ぉ〲なぱぽた:Lcom/google/android/material/bottomnavigation/BottomNavigationPresenter;

    const/4 v2, 0x0

    .line 3
    invoke-virtual {v1, p1, v0, v2}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->は〲ぱなで(Landroid/view/MenuItem;Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ;I)Z

    move-result v0

    if-nez v0, :cond_17

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;->setChecked(Z)Landroid/view/MenuItem;

    :cond_17
    return-void
.end method
