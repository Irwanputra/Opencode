.class public Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/けときぜと/げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic 〺つふすそ:Lcom/google/android/material/tabs/TabLayout$TabView;

.field public final synthetic げつ〴ぬぐ:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/google/android/material/tabs/TabLayout$TabView;Landroid/view/View;)V
    .registers 3

    iput-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/けときぜと/げつ〴ぬぐ;->〺つふすそ:Lcom/google/android/material/tabs/TabLayout$TabView;

    iput-object p2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/けときぜと/げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLayoutChange(Landroid/view/View;IIIIIIII)V
    .registers 10

    iget-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/けときぜと/げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-nez p1, :cond_11

    iget-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/けときぜと/げつ〴ぬぐ;->〺つふすそ:Lcom/google/android/material/tabs/TabLayout$TabView;

    iget-object p2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/けときぜと/げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/view/View;

    .line 1
    sget p3, Lcom/google/android/material/tabs/TabLayout$TabView;->のぷのちつ:I

    invoke-virtual {p1, p2}, Lcom/google/android/material/tabs/TabLayout$TabView;->ぁごぐすすぃ(Landroid/view/View;)V

    :cond_11
    return-void
.end method
