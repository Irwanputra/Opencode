.class public Lca/psiphon/PsiphonTunnel$づざかべべ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lpsi/PsiphonProvider;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lca/psiphon/PsiphonTunnel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u3065\u3056\u304b\u3079\u3079"
.end annotation


# instance fields
.field public 〺つふすそ:Lca/psiphon/PsiphonTunnel;


# direct methods
.method public constructor <init>(Lca/psiphon/PsiphonTunnel;Lca/psiphon/PsiphonTunnel;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lca/psiphon/PsiphonTunnel$づざかべべ;->〺つふすそ:Lca/psiphon/PsiphonTunnel;

    return-void
.end method


# virtual methods
.method public bindToDevice(J)Ljava/lang/String;
    .registers 4

    iget-object v0, p0, Lca/psiphon/PsiphonTunnel$づざかべべ;->〺つふすそ:Lca/psiphon/PsiphonTunnel;

    # invokes: Lca/psiphon/PsiphonTunnel;->bindToDevice(J)Ljava/lang/String;
    invoke-static {v0, p1, p2}, Lca/psiphon/PsiphonTunnel;->access$100(Lca/psiphon/PsiphonTunnel;J)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getNetworkID()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lca/psiphon/PsiphonTunnel$づざかべべ;->〺つふすそ:Lca/psiphon/PsiphonTunnel;

    # invokes: Lca/psiphon/PsiphonTunnel;->getNetworkID()Ljava/lang/String;
    invoke-static {v0}, Lca/psiphon/PsiphonTunnel;->access$600(Lca/psiphon/PsiphonTunnel;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getPrimaryDnsServer()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lca/psiphon/PsiphonTunnel$づざかべべ;->〺つふすそ:Lca/psiphon/PsiphonTunnel;

    # invokes: Lca/psiphon/PsiphonTunnel;->getPrimaryDnsServer()Ljava/lang/String;
    invoke-static {v0}, Lca/psiphon/PsiphonTunnel;->access$300(Lca/psiphon/PsiphonTunnel;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getSecondaryDnsServer()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lca/psiphon/PsiphonTunnel$づざかべべ;->〺つふすそ:Lca/psiphon/PsiphonTunnel;

    # invokes: Lca/psiphon/PsiphonTunnel;->getSecondaryDnsServer()Ljava/lang/String;
    invoke-static {v0}, Lca/psiphon/PsiphonTunnel;->access$400(Lca/psiphon/PsiphonTunnel;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public hasNetworkConnectivity()J
    .registers 3

    iget-object v0, p0, Lca/psiphon/PsiphonTunnel$づざかべべ;->〺つふすそ:Lca/psiphon/PsiphonTunnel;

    # invokes: Lca/psiphon/PsiphonTunnel;->hasNetworkConnectivity()J
    invoke-static {v0}, Lca/psiphon/PsiphonTunnel;->access$200(Lca/psiphon/PsiphonTunnel;)J

    move-result-wide v0

    return-wide v0
.end method

.method public iPv6Synthesize(Ljava/lang/String;)Ljava/lang/String;
    .registers 3

    iget-object v0, p0, Lca/psiphon/PsiphonTunnel$づざかべべ;->〺つふすそ:Lca/psiphon/PsiphonTunnel;

    # invokes: Lca/psiphon/PsiphonTunnel;->iPv6Synthesize(Ljava/lang/String;)Ljava/lang/String;
    invoke-static {v0, p1}, Lca/psiphon/PsiphonTunnel;->access$500(Lca/psiphon/PsiphonTunnel;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public notice(Ljava/lang/String;)V
    .registers 3

    iget-object v0, p0, Lca/psiphon/PsiphonTunnel$づざかべべ;->〺つふすそ:Lca/psiphon/PsiphonTunnel;

    # invokes: Lca/psiphon/PsiphonTunnel;->notice(Ljava/lang/String;)V
    invoke-static {v0, p1}, Lca/psiphon/PsiphonTunnel;->access$000(Lca/psiphon/PsiphonTunnel;Ljava/lang/String;)V

    return-void
.end method
