.class public Ldev/epro/v2ray/bean/inbounds/InboundBean;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public listen:Ljava/lang/String;

.field public port:I

.field public protocol:Ljava/lang/String;

.field public settings:Ldev/epro/v2ray/bean/inbounds/InSettingsBean;

.field public sniffing:Ldev/epro/v2ray/bean/inbounds/SniffingBean;

.field public tag:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getListen()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/bean/inbounds/InboundBean;->listen:Ljava/lang/String;

    return-object v0
.end method

.method public getPort()I
    .registers 2

    iget v0, p0, Ldev/epro/v2ray/bean/inbounds/InboundBean;->port:I

    return v0
.end method

.method public getProtocol()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/bean/inbounds/InboundBean;->protocol:Ljava/lang/String;

    return-object v0
.end method

.method public getSettings()Ldev/epro/v2ray/bean/inbounds/InSettingsBean;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/bean/inbounds/InboundBean;->settings:Ldev/epro/v2ray/bean/inbounds/InSettingsBean;

    return-object v0
.end method

.method public getSniffing()Ldev/epro/v2ray/bean/inbounds/SniffingBean;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/bean/inbounds/InboundBean;->sniffing:Ldev/epro/v2ray/bean/inbounds/SniffingBean;

    return-object v0
.end method

.method public getTag()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/bean/inbounds/InboundBean;->tag:Ljava/lang/String;

    return-object v0
.end method

.method public setListen(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/bean/inbounds/InboundBean;->listen:Ljava/lang/String;

    return-void
.end method

.method public setPort(I)V
    .registers 2

    iput p1, p0, Ldev/epro/v2ray/bean/inbounds/InboundBean;->port:I

    return-void
.end method

.method public setProtocol(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/bean/inbounds/InboundBean;->protocol:Ljava/lang/String;

    return-void
.end method

.method public setSettings(Ldev/epro/v2ray/bean/inbounds/InSettingsBean;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/bean/inbounds/InboundBean;->settings:Ldev/epro/v2ray/bean/inbounds/InSettingsBean;

    return-void
.end method

.method public setSniffing(Ldev/epro/v2ray/bean/inbounds/SniffingBean;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/bean/inbounds/InboundBean;->sniffing:Ldev/epro/v2ray/bean/inbounds/SniffingBean;

    return-void
.end method

.method public setTag(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/bean/inbounds/InboundBean;->tag:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 5

    const-string v0, "InboundBean{tag=\'"

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ldev/epro/v2ray/bean/inbounds/InboundBean;->tag:Ljava/lang/String;

    const/16 v2, 0x27

    const-string v3, ", port="

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget v1, p0, Ldev/epro/v2ray/bean/inbounds/InboundBean;->port:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", protocol=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/bean/inbounds/InboundBean;->protocol:Ljava/lang/String;

    const-string v3, ", listen=\'"

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Ldev/epro/v2ray/bean/inbounds/InboundBean;->listen:Ljava/lang/String;

    const-string v3, ", settings="

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Ldev/epro/v2ray/bean/inbounds/InboundBean;->settings:Ldev/epro/v2ray/bean/inbounds/InSettingsBean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sniffing="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/bean/inbounds/InboundBean;->sniffing:Ldev/epro/v2ray/bean/inbounds/SniffingBean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
