.class public Lcom/google/android/material/navigation/NavigationView$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ$げつ〴ぬぐ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/navigation/NavigationView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lcom/google/android/material/navigation/NavigationView;


# direct methods
.method public constructor <init>(Lcom/google/android/material/navigation/NavigationView;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/material/navigation/NavigationView$げつ〴ぬぐ;->〺つふすそ:Lcom/google/android/material/navigation/NavigationView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;)V
    .registers 2

    return-void
.end method

.method public げつ〴ぬぐ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;Landroid/view/MenuItem;)Z
    .registers 4

    iget-object p1, p0, Lcom/google/android/material/navigation/NavigationView$げつ〴ぬぐ;->〺つふすそ:Lcom/google/android/material/navigation/NavigationView;

    iget-object p1, p1, Lcom/google/android/material/navigation/NavigationView;->ぺぁあねじ:Lcom/google/android/material/navigation/NavigationView$〺つふすそ;

    if-eqz p1, :cond_2f

    check-cast p1, Lteam/dev/epro/apkcustom/MainActivity;

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    move-result p2

    iput p2, p1, Lteam/dev/epro/apkcustom/MainActivity;->ぎきぁ〱ぢ:I

    new-instance p2, Landroid/app/ProgressDialog;

    const v0, 0x7f1200f1

    invoke-direct {p2, p1, v0}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;I)V

    iput-object p2, p1, Lteam/dev/epro/apkcustom/MainActivity;->な〱ちぉじ:Landroid/app/ProgressDialog;

    const-string v0, "Loading..."

    invoke-virtual {p2, v0}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    iget-object p2, p1, Lteam/dev/epro/apkcustom/MainActivity;->な〱ちぉじ:Landroid/app/ProgressDialog;

    invoke-virtual {p2}, Landroid/app/ProgressDialog;->show()V

    iget-object p1, p1, Lteam/dev/epro/apkcustom/MainActivity;->ざっざへづ:Landroidx/drawerlayout/widget/DrawerLayout;

    const p2, 0x800003

    invoke-virtual {p1, p2}, Landroidx/drawerlayout/widget/DrawerLayout;->〺つふすそ(I)V

    const/4 p1, 0x1

    goto :goto_30

    :cond_2f
    const/4 p1, 0x0

    :goto_30
    return p1
.end method
