.class public Ldev/epro/v2ray/util/V2rayConfig;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public dns:Ldev/epro/v2ray/bean/dns/DnsBean;

.field public inbounds:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ldev/epro/v2ray/bean/inbounds/InboundBean;",
            ">;"
        }
    .end annotation
.end field

.field public log:Ldev/epro/v2ray/bean/LogBean;

.field public outbounds:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ldev/epro/v2ray/bean/outbounds/OutboundBean;",
            ">;"
        }
    .end annotation
.end field

.field public policy:Ldev/epro/v2ray/bean/policy/PolicyBean;

.field public routing:Ldev/epro/v2ray/bean/routing/RoutingBean;

.field public stats:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDns()Ldev/epro/v2ray/bean/dns/DnsBean;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/util/V2rayConfig;->dns:Ldev/epro/v2ray/bean/dns/DnsBean;

    return-object v0
.end method

.method public getInbounds()Ljava/util/ArrayList;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ldev/epro/v2ray/bean/inbounds/InboundBean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ldev/epro/v2ray/util/V2rayConfig;->inbounds:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getLog()Ldev/epro/v2ray/bean/LogBean;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/util/V2rayConfig;->log:Ldev/epro/v2ray/bean/LogBean;

    return-object v0
.end method

.method public getOutbounds()Ljava/util/ArrayList;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ldev/epro/v2ray/bean/outbounds/OutboundBean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ldev/epro/v2ray/util/V2rayConfig;->outbounds:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getPolicy()Ldev/epro/v2ray/bean/policy/PolicyBean;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/util/V2rayConfig;->policy:Ldev/epro/v2ray/bean/policy/PolicyBean;

    return-object v0
.end method

.method public getRouting()Ldev/epro/v2ray/bean/routing/RoutingBean;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/util/V2rayConfig;->routing:Ldev/epro/v2ray/bean/routing/RoutingBean;

    return-object v0
.end method

.method public getStats()Ljava/lang/Object;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/util/V2rayConfig;->stats:Ljava/lang/Object;

    return-object v0
.end method

.method public setDns(Ldev/epro/v2ray/bean/dns/DnsBean;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/util/V2rayConfig;->dns:Ldev/epro/v2ray/bean/dns/DnsBean;

    return-void
.end method

.method public setInbounds(Ljava/util/ArrayList;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ldev/epro/v2ray/bean/inbounds/InboundBean;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldev/epro/v2ray/util/V2rayConfig;->inbounds:Ljava/util/ArrayList;

    return-void
.end method

.method public setLog(Ldev/epro/v2ray/bean/LogBean;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/util/V2rayConfig;->log:Ldev/epro/v2ray/bean/LogBean;

    return-void
.end method

.method public setOutbounds(Ljava/util/ArrayList;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ldev/epro/v2ray/bean/outbounds/OutboundBean;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldev/epro/v2ray/util/V2rayConfig;->outbounds:Ljava/util/ArrayList;

    return-void
.end method

.method public setPolicy(Ldev/epro/v2ray/bean/policy/PolicyBean;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/util/V2rayConfig;->policy:Ldev/epro/v2ray/bean/policy/PolicyBean;

    return-void
.end method

.method public setRouting(Ldev/epro/v2ray/bean/routing/RoutingBean;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/util/V2rayConfig;->routing:Ldev/epro/v2ray/bean/routing/RoutingBean;

    return-void
.end method

.method public setStats(Ljava/lang/Object;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/util/V2rayConfig;->stats:Ljava/lang/Object;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    const-string v0, "V2rayConfig{stats="

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ldev/epro/v2ray/util/V2rayConfig;->stats:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", log="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/util/V2rayConfig;->log:Ldev/epro/v2ray/bean/LogBean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", policy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/util/V2rayConfig;->policy:Ldev/epro/v2ray/bean/policy/PolicyBean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", inbounds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/util/V2rayConfig;->inbounds:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", outbounds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/util/V2rayConfig;->outbounds:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", dns="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/util/V2rayConfig;->dns:Ldev/epro/v2ray/bean/dns/DnsBean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", routing="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/util/V2rayConfig;->routing:Ldev/epro/v2ray/bean/routing/RoutingBean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
