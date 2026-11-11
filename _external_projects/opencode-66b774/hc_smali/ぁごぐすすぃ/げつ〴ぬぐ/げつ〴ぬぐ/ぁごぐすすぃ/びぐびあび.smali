.class public final Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/びぐびあび;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field public final synthetic 〺つふすそ:Ljava/util/concurrent/BlockingQueue;

.field public volatile げつ〴ぬぐ:Z


# direct methods
.method public constructor <init>(Ljava/util/concurrent/BlockingQueue;)V
    .registers 2

    iput-object p1, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/びぐびあび;->〺つふすそ:Ljava/util/concurrent/BlockingQueue;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/びぐびあび;->げつ〴ぬぐ:Z

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .registers 5

    iget-boolean p1, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/びぐびあび;->げつ〴ぬぐ:Z

    if-nez p1, :cond_30

    const/4 p1, 0x1

    iput-boolean p1, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/びぐびあび;->げつ〴ぬぐ:Z

    :try_start_7
    iget-object p1, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/びぐびあび;->〺つふすそ:Ljava/util/concurrent/BlockingQueue;

    .line 1
    sget v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ/くし〴〺ぅ$げつ〴ぬぐ;->〺つふすそ:I

    if-nez p2, :cond_f

    const/4 p2, 0x0

    goto :goto_2d

    :cond_f
    const-string v0, "\u001e3<K0>M1:K7:KknHc9I4l\u001af<\u001dbfOfi\u00196<H1kL3=J0iOeiIboK`jAf:\u001eeoNaj\u001acg\u001b4mMdlI`hJ`g\u001eggI0:H7j\u0019d>IfgHjlMdgOjg\u001e7;Mkh\u001akkM6=H6>IgjOfk\u001bkh@3<Ie"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    if-eqz v0, :cond_27

    instance-of v1, v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ/くし〴〺ぅ;

    if-eqz v1, :cond_27

    move-object p2, v0

    check-cast p2, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ/くし〴〺ぅ;

    goto :goto_2d

    :cond_27
    new-instance v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ/くし〴〺ぅ$げつ〴ぬぐ$げつ〴ぬぐ;

    invoke-direct {v0, p2}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ/くし〴〺ぅ$げつ〴ぬぐ$げつ〴ぬぐ;-><init>(Landroid/os/IBinder;)V

    move-object p2, v0

    .line 2
    :goto_2d
    invoke-interface {p1, p2}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_30
    .catch Ljava/lang/InterruptedException; {:try_start_7 .. :try_end_30} :catch_30

    :catch_30
    :cond_30
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .registers 2

    return-void
.end method
