.class public Lca/psiphon/PsiphonTunnel$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lca/psiphon/PsiphonTunnel;->startTun2Socks(Landroid/os/ParcelFileDescriptor;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〳ぜぞぜべっ:Z

.field public final synthetic 〺つふすそ:Landroid/os/ParcelFileDescriptor;

.field public final synthetic ぁごぐすすぃ:Ljava/lang/String;

.field public final synthetic くし〴〺ぅ:I

.field public final synthetic づざかべべ:Ljava/lang/String;

.field public final synthetic なぎぱいぢぎ:Ljava/lang/String;

.field public final synthetic びぐびあび:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lca/psiphon/PsiphonTunnel;Landroid/os/ParcelFileDescriptor;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .registers 9

    iput-object p2, p0, Lca/psiphon/PsiphonTunnel$げつ〴ぬぐ;->〺つふすそ:Landroid/os/ParcelFileDescriptor;

    iput p3, p0, Lca/psiphon/PsiphonTunnel$げつ〴ぬぐ;->くし〴〺ぅ:I

    iput-object p4, p0, Lca/psiphon/PsiphonTunnel$げつ〴ぬぐ;->びぐびあび:Ljava/lang/String;

    iput-object p5, p0, Lca/psiphon/PsiphonTunnel$げつ〴ぬぐ;->づざかべべ:Ljava/lang/String;

    iput-object p6, p0, Lca/psiphon/PsiphonTunnel$げつ〴ぬぐ;->なぎぱいぢぎ:Ljava/lang/String;

    iput-object p7, p0, Lca/psiphon/PsiphonTunnel$げつ〴ぬぐ;->ぁごぐすすぃ:Ljava/lang/String;

    iput-boolean p8, p0, Lca/psiphon/PsiphonTunnel$げつ〴ぬぐ;->〳ぜぞぜべっ:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 9

    iget-object v0, p0, Lca/psiphon/PsiphonTunnel$げつ〴ぬぐ;->〺つふすそ:Landroid/os/ParcelFileDescriptor;

    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->detachFd()I

    move-result v1

    iget v2, p0, Lca/psiphon/PsiphonTunnel$げつ〴ぬぐ;->くし〴〺ぅ:I

    iget-object v3, p0, Lca/psiphon/PsiphonTunnel$げつ〴ぬぐ;->びぐびあび:Ljava/lang/String;

    iget-object v4, p0, Lca/psiphon/PsiphonTunnel$げつ〴ぬぐ;->づざかべべ:Ljava/lang/String;

    iget-object v5, p0, Lca/psiphon/PsiphonTunnel$げつ〴ぬぐ;->なぎぱいぢぎ:Ljava/lang/String;

    iget-object v6, p0, Lca/psiphon/PsiphonTunnel$げつ〴ぬぐ;->ぁごぐすすぃ:Ljava/lang/String;

    iget-boolean v7, p0, Lca/psiphon/PsiphonTunnel$げつ〴ぬぐ;->〳ぜぞぜべっ:Z

    # invokes: Lca/psiphon/PsiphonTunnel;->runTun2Socks(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)I
    invoke-static/range {v1 .. v7}, Lca/psiphon/PsiphonTunnel;->access$700(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)I

    return-void
.end method
