.class public Lteam/dev/epro/apkcustom/MainActivity$いいにぽつ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lteam/dev/epro/apkcustom/MainActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lteam/dev/epro/apkcustom/MainActivity;


# direct methods
.method public constructor <init>(Lteam/dev/epro/apkcustom/MainActivity;)V
    .registers 2

    iput-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$いいにぽつ;->〺つふすそ:Lteam/dev/epro/apkcustom/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .registers 5

    .line 1
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const/4 v0, 0x1

    const-string v1, "\u001bcf\u001edgA0l\u001ddjOfi\u001c7k\u001djn\u001dcn\u0019k9\u001c7l\u001dd"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-nez p1, :cond_47

    iget-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$いいにぽつ;->〺つふすそ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 3
    iget-object v0, p1, Lteam/dev/epro/apkcustom/MainActivity;->なぶひせが:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/てぜきぽく/〳ぜぞぜべっ;

    if-eqz v0, :cond_47

    .line 4
    iget v1, p1, Lteam/dev/epro/apkcustom/MainActivity;->げがぴうあだ:I

    if-eqz v1, :cond_1e

    goto :goto_47

    .line 5
    :cond_1e
    iget p1, p1, Lteam/dev/epro/apkcustom/MainActivity;->ぇとしたべど:I

    const/4 v1, 0x0

    if-nez p1, :cond_33

    .line 6
    iget-object p1, v0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/てぜきぽく/〳ぜぞぜべっ;->〱こか〺ぃせ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->びちづぼぬ(I)V

    iget-object p1, v0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/てぜきぽく/〳ぜぞぜべっ;->ぺがぅす〹ち:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/てぜきぽく/〳ぜぞぜべっ$ざとぅぼこ〺;

    if-eqz p1, :cond_47

    const v0, 0x7f0801a6

    invoke-interface {p1, v0}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/てぜきぽく/〳ぜぞぜべっ$ざとぅぼこ〺;->〳ぜぞぜべっ(I)V

    goto :goto_47

    .line 7
    :cond_33
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->びぐびあび()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    if-nez p1, :cond_3a

    goto :goto_47

    :cond_3a
    iget-object p1, v0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/てぜきぽく/〳ぜぞぜべっ;->くぎぶ〼のそ:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 8
    iget-boolean v2, p1, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->びぐびあび:Z

    if-eqz v2, :cond_41

    goto :goto_47

    .line 9
    :cond_41
    invoke-virtual {p1, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setEnabled(Z)V

    invoke-virtual {v0}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/てぜきぽく/〳ぜぞぜべっ;->へ〱そかのず()V

    :cond_47
    :goto_47
    return-void
.end method
