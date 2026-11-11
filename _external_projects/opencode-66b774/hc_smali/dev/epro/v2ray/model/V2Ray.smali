.class public Ldev/epro/v2ray/model/V2Ray;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public api:Ldev/epro/v2ray/model/api/ApiObject;

.field public dns:Ldev/epro/v2ray/model/dns/DnsObject;

.field public inbounds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ldev/epro/v2ray/model/inbounds/InboundObject;",
            ">;"
        }
    .end annotation
.end field

.field public log:Ldev/epro/v2ray/model/log/LogObject;

.field public outbounds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ldev/epro/v2ray/model/outbounds/OutboundObject;",
            ">;"
        }
    .end annotation
.end field

.field public policy:Ldev/epro/v2ray/model/policy/PolicyObject;

.field public reverse:Ldev/epro/v2ray/model/reverse/ReverseObject;

.field public routing:Ldev/epro/v2ray/model/routing/RoutingObject;

.field public stats:Ldev/epro/v2ray/model/stats/StatsObject;

.field public transport:Ldev/epro/v2ray/model/transport/TransportObject;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getApi()Ldev/epro/v2ray/model/api/ApiObject;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/V2Ray;->api:Ldev/epro/v2ray/model/api/ApiObject;

    return-object v0
.end method

.method public getDns()Ldev/epro/v2ray/model/dns/DnsObject;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/V2Ray;->dns:Ldev/epro/v2ray/model/dns/DnsObject;

    return-object v0
.end method

.method public getInbounds()Ljava/util/List;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ldev/epro/v2ray/model/inbounds/InboundObject;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ldev/epro/v2ray/model/V2Ray;->inbounds:Ljava/util/List;

    return-object v0
.end method

.method public getLog()Ldev/epro/v2ray/model/log/LogObject;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/V2Ray;->log:Ldev/epro/v2ray/model/log/LogObject;

    return-object v0
.end method

.method public getOutbounds()Ljava/util/List;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ldev/epro/v2ray/model/outbounds/OutboundObject;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ldev/epro/v2ray/model/V2Ray;->outbounds:Ljava/util/List;

    return-object v0
.end method

.method public getPolicy()Ldev/epro/v2ray/model/policy/PolicyObject;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/V2Ray;->policy:Ldev/epro/v2ray/model/policy/PolicyObject;

    return-object v0
.end method

.method public getReverse()Ldev/epro/v2ray/model/reverse/ReverseObject;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/V2Ray;->reverse:Ldev/epro/v2ray/model/reverse/ReverseObject;

    return-object v0
.end method

.method public getRouting()Ldev/epro/v2ray/model/routing/RoutingObject;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/V2Ray;->routing:Ldev/epro/v2ray/model/routing/RoutingObject;

    return-object v0
.end method

.method public getStats()Ldev/epro/v2ray/model/stats/StatsObject;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/V2Ray;->stats:Ldev/epro/v2ray/model/stats/StatsObject;

    return-object v0
.end method

.method public getTransport()Ldev/epro/v2ray/model/transport/TransportObject;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/V2Ray;->transport:Ldev/epro/v2ray/model/transport/TransportObject;

    return-object v0
.end method

.method public setApi(Ldev/epro/v2ray/model/api/ApiObject;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/V2Ray;->api:Ldev/epro/v2ray/model/api/ApiObject;

    return-void
.end method

.method public setDns(Ldev/epro/v2ray/model/dns/DnsObject;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/V2Ray;->dns:Ldev/epro/v2ray/model/dns/DnsObject;

    return-void
.end method

.method public setInbounds(Ljava/util/List;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ldev/epro/v2ray/model/inbounds/InboundObject;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldev/epro/v2ray/model/V2Ray;->inbounds:Ljava/util/List;

    return-void
.end method

.method public setLog(Ldev/epro/v2ray/model/log/LogObject;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/V2Ray;->log:Ldev/epro/v2ray/model/log/LogObject;

    return-void
.end method

.method public setOutbounds(Ljava/util/List;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ldev/epro/v2ray/model/outbounds/OutboundObject;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldev/epro/v2ray/model/V2Ray;->outbounds:Ljava/util/List;

    return-void
.end method

.method public setPolicy(Ldev/epro/v2ray/model/policy/PolicyObject;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/V2Ray;->policy:Ldev/epro/v2ray/model/policy/PolicyObject;

    return-void
.end method

.method public setReverse(Ldev/epro/v2ray/model/reverse/ReverseObject;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/V2Ray;->reverse:Ldev/epro/v2ray/model/reverse/ReverseObject;

    return-void
.end method

.method public setRouting(Ldev/epro/v2ray/model/routing/RoutingObject;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/V2Ray;->routing:Ldev/epro/v2ray/model/routing/RoutingObject;

    return-void
.end method

.method public setStats(Ldev/epro/v2ray/model/stats/StatsObject;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/V2Ray;->stats:Ldev/epro/v2ray/model/stats/StatsObject;

    return-void
.end method

.method public setTransport(Ldev/epro/v2ray/model/transport/TransportObject;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/V2Ray;->transport:Ldev/epro/v2ray/model/transport/TransportObject;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    const-string v0, "V2Ray{log="

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ldev/epro/v2ray/model/V2Ray;->log:Ldev/epro/v2ray/model/log/LogObject;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", api="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/model/V2Ray;->api:Ldev/epro/v2ray/model/api/ApiObject;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", dns="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/model/V2Ray;->dns:Ldev/epro/v2ray/model/dns/DnsObject;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", stats="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/model/V2Ray;->stats:Ldev/epro/v2ray/model/stats/StatsObject;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", routing="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/model/V2Ray;->routing:Ldev/epro/v2ray/model/routing/RoutingObject;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", policy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/model/V2Ray;->policy:Ldev/epro/v2ray/model/policy/PolicyObject;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", inbounds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/model/V2Ray;->inbounds:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", outbounds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/model/V2Ray;->outbounds:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", transport="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/model/V2Ray;->transport:Ldev/epro/v2ray/model/transport/TransportObject;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", reverse="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/model/V2Ray;->reverse:Ldev/epro/v2ray/model/reverse/ReverseObject;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
