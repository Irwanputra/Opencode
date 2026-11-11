.class public Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/づざかべべ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final 〺つふすそ:Landroid/content/Context;

.field public final くし〴〺ぅ:Landroid/content/ServiceConnection;

.field public final びぐびあび:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ/くし〴〺ぅ;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/content/ServiceConnection;Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ/くし〴〺ぅ;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/づざかべべ;->〺つふすそ:Landroid/content/Context;

    iput-object p2, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/づざかべべ;->くし〴〺ぅ:Landroid/content/ServiceConnection;

    iput-object p3, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/づざかべべ;->びぐびあび:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ/くし〴〺ぅ;

    return-void
.end method


# virtual methods
.method public close()V
    .registers 3

    iget-object v0, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/づざかべべ;->〺つふすそ:Landroid/content/Context;

    iget-object v1, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/づざかべべ;->くし〴〺ぅ:Landroid/content/ServiceConnection;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    return-void
.end method
