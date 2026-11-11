.class public Ldev/epro/v2ray/bean/outbounds/stream/ws/WsSettingsBean;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public headers:Ldev/epro/v2ray/bean/outbounds/stream/ws/HeadersBean;

.field public path:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Ldev/epro/v2ray/bean/outbounds/stream/ws/WsSettingsBean;->path:Ljava/lang/String;

    new-instance v0, Ldev/epro/v2ray/bean/outbounds/stream/ws/HeadersBean;

    invoke-direct {v0}, Ldev/epro/v2ray/bean/outbounds/stream/ws/HeadersBean;-><init>()V

    iput-object v0, p0, Ldev/epro/v2ray/bean/outbounds/stream/ws/WsSettingsBean;->headers:Ldev/epro/v2ray/bean/outbounds/stream/ws/HeadersBean;

    return-void
.end method


# virtual methods
.method public getHeaders()Ldev/epro/v2ray/bean/outbounds/stream/ws/HeadersBean;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/bean/outbounds/stream/ws/WsSettingsBean;->headers:Ldev/epro/v2ray/bean/outbounds/stream/ws/HeadersBean;

    return-object v0
.end method

.method public getPath()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/bean/outbounds/stream/ws/WsSettingsBean;->path:Ljava/lang/String;

    return-object v0
.end method

.method public setHeaders(Ldev/epro/v2ray/bean/outbounds/stream/ws/HeadersBean;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/bean/outbounds/stream/ws/WsSettingsBean;->headers:Ldev/epro/v2ray/bean/outbounds/stream/ws/HeadersBean;

    return-void
.end method

.method public setPath(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/bean/outbounds/stream/ws/WsSettingsBean;->path:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 5

    const-string v0, "WsSettingsBean{path=\'"

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ldev/epro/v2ray/bean/outbounds/stream/ws/WsSettingsBean;->path:Ljava/lang/String;

    const/16 v2, 0x27

    const-string v3, ", headers="

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Ldev/epro/v2ray/bean/outbounds/stream/ws/WsSettingsBean;->headers:Ldev/epro/v2ray/bean/outbounds/stream/ws/HeadersBean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
