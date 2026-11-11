.class public Ldev/epro/v2ray/util/VmessBean;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public address:Ljava/lang/String;

.field public alterId:I

.field public configType:I

.field public configVersion:I

.field public guid:Ljava/lang/String;

.field public headerType:Ljava/lang/String;

.field public id:Ljava/lang/String;

.field public network:Ljava/lang/String;

.field public path:Ljava/lang/String;

.field public port:I

.field public remarks:Ljava/lang/String;

.field public requestHost:Ljava/lang/String;

.field public security:Ljava/lang/String;

.field public streamSecurity:Ljava/lang/String;

.field public subid:Ljava/lang/String;

.field public testResult:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "123456"

    iput-object v0, p0, Ldev/epro/v2ray/util/VmessBean;->guid:Ljava/lang/String;

    const-string v0, "v2ray.cool"

    iput-object v0, p0, Ldev/epro/v2ray/util/VmessBean;->address:Ljava/lang/String;

    const/16 v0, 0x2766

    iput v0, p0, Ldev/epro/v2ray/util/VmessBean;->port:I

    const-string v0, "a3482e88-686a-4a58-8126-99c9df64b7bf"

    iput-object v0, p0, Ldev/epro/v2ray/util/VmessBean;->id:Ljava/lang/String;

    const/16 v0, 0x40

    iput v0, p0, Ldev/epro/v2ray/util/VmessBean;->alterId:I

    const-string v0, "aes-128-cfb"

    iput-object v0, p0, Ldev/epro/v2ray/util/VmessBean;->security:Ljava/lang/String;

    const-string v0, "tcp"

    iput-object v0, p0, Ldev/epro/v2ray/util/VmessBean;->network:Ljava/lang/String;

    const-string v0, "def"

    iput-object v0, p0, Ldev/epro/v2ray/util/VmessBean;->remarks:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Ldev/epro/v2ray/util/VmessBean;->headerType:Ljava/lang/String;

    iput-object v0, p0, Ldev/epro/v2ray/util/VmessBean;->requestHost:Ljava/lang/String;

    iput-object v0, p0, Ldev/epro/v2ray/util/VmessBean;->path:Ljava/lang/String;

    const-string v1, "none"

    iput-object v1, p0, Ldev/epro/v2ray/util/VmessBean;->streamSecurity:Ljava/lang/String;

    const/4 v1, 0x1

    iput v1, p0, Ldev/epro/v2ray/util/VmessBean;->configType:I

    iput v1, p0, Ldev/epro/v2ray/util/VmessBean;->configVersion:I

    iput-object v0, p0, Ldev/epro/v2ray/util/VmessBean;->testResult:Ljava/lang/String;

    iput-object v0, p0, Ldev/epro/v2ray/util/VmessBean;->subid:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getAddress()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/util/VmessBean;->address:Ljava/lang/String;

    return-object v0
.end method

.method public getAlterId()I
    .registers 2

    iget v0, p0, Ldev/epro/v2ray/util/VmessBean;->alterId:I

    return v0
.end method

.method public getConfigType()I
    .registers 2

    iget v0, p0, Ldev/epro/v2ray/util/VmessBean;->configType:I

    return v0
.end method

.method public getConfigVersion()I
    .registers 2

    iget v0, p0, Ldev/epro/v2ray/util/VmessBean;->configVersion:I

    return v0
.end method

.method public getGuid()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/util/VmessBean;->guid:Ljava/lang/String;

    return-object v0
.end method

.method public getHeaderType()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/util/VmessBean;->headerType:Ljava/lang/String;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/util/VmessBean;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getNetwork()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/util/VmessBean;->network:Ljava/lang/String;

    return-object v0
.end method

.method public getPath()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/util/VmessBean;->path:Ljava/lang/String;

    return-object v0
.end method

.method public getPort()I
    .registers 2

    iget v0, p0, Ldev/epro/v2ray/util/VmessBean;->port:I

    return v0
.end method

.method public getRemarks()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/util/VmessBean;->remarks:Ljava/lang/String;

    return-object v0
.end method

.method public getRequestHost()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/util/VmessBean;->requestHost:Ljava/lang/String;

    return-object v0
.end method

.method public getSecurity()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/util/VmessBean;->security:Ljava/lang/String;

    return-object v0
.end method

.method public getStreamSecurity()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/util/VmessBean;->streamSecurity:Ljava/lang/String;

    return-object v0
.end method

.method public getSubid()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/util/VmessBean;->subid:Ljava/lang/String;

    return-object v0
.end method

.method public getTestResult()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/util/VmessBean;->testResult:Ljava/lang/String;

    return-object v0
.end method

.method public setAddress(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/util/VmessBean;->address:Ljava/lang/String;

    return-void
.end method

.method public setAlterId(I)V
    .registers 2

    iput p1, p0, Ldev/epro/v2ray/util/VmessBean;->alterId:I

    return-void
.end method

.method public setConfigType(I)V
    .registers 2

    iput p1, p0, Ldev/epro/v2ray/util/VmessBean;->configType:I

    return-void
.end method

.method public setConfigVersion(I)V
    .registers 2

    iput p1, p0, Ldev/epro/v2ray/util/VmessBean;->configVersion:I

    return-void
.end method

.method public setGuid(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/util/VmessBean;->guid:Ljava/lang/String;

    return-void
.end method

.method public setHeaderType(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/util/VmessBean;->headerType:Ljava/lang/String;

    return-void
.end method

.method public setId(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/util/VmessBean;->id:Ljava/lang/String;

    return-void
.end method

.method public setNetwork(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/util/VmessBean;->network:Ljava/lang/String;

    return-void
.end method

.method public setPath(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/util/VmessBean;->path:Ljava/lang/String;

    return-void
.end method

.method public setPort(I)V
    .registers 2

    iput p1, p0, Ldev/epro/v2ray/util/VmessBean;->port:I

    return-void
.end method

.method public setRemarks(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/util/VmessBean;->remarks:Ljava/lang/String;

    return-void
.end method

.method public setRequestHost(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/util/VmessBean;->requestHost:Ljava/lang/String;

    return-void
.end method

.method public setSecurity(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/util/VmessBean;->security:Ljava/lang/String;

    return-void
.end method

.method public setStreamSecurity(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/util/VmessBean;->streamSecurity:Ljava/lang/String;

    return-void
.end method

.method public setSubid(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/util/VmessBean;->subid:Ljava/lang/String;

    return-void
.end method

.method public setTestResult(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/util/VmessBean;->testResult:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 5

    const-string v0, "VmessBean{guid=\'"

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ldev/epro/v2ray/util/VmessBean;->guid:Ljava/lang/String;

    const/16 v2, 0x27

    const-string v3, ", address=\'"

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Ldev/epro/v2ray/util/VmessBean;->address:Ljava/lang/String;

    const-string v3, ", port="

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget v1, p0, Ldev/epro/v2ray/util/VmessBean;->port:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", id=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/util/VmessBean;->id:Ljava/lang/String;

    const-string v3, ", alterId="

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget v1, p0, Ldev/epro/v2ray/util/VmessBean;->alterId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", security=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/util/VmessBean;->security:Ljava/lang/String;

    const-string v3, ", network=\'"

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Ldev/epro/v2ray/util/VmessBean;->network:Ljava/lang/String;

    const-string v3, ", remarks=\'"

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Ldev/epro/v2ray/util/VmessBean;->remarks:Ljava/lang/String;

    const-string v3, ", headerType=\'"

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Ldev/epro/v2ray/util/VmessBean;->headerType:Ljava/lang/String;

    const-string v3, ", requestHost=\'"

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Ldev/epro/v2ray/util/VmessBean;->requestHost:Ljava/lang/String;

    const-string v3, ", path=\'"

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Ldev/epro/v2ray/util/VmessBean;->path:Ljava/lang/String;

    const-string v3, ", streamSecurity=\'"

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Ldev/epro/v2ray/util/VmessBean;->streamSecurity:Ljava/lang/String;

    const-string v3, ", configType="

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget v1, p0, Ldev/epro/v2ray/util/VmessBean;->configType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", configVersion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ldev/epro/v2ray/util/VmessBean;->configVersion:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", testResult=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/util/VmessBean;->testResult:Ljava/lang/String;

    const-string v3, ", subid=\'"

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Ldev/epro/v2ray/util/VmessBean;->subid:Ljava/lang/String;

    const/16 v3, 0x7d

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->づざかべべ(Ljava/lang/StringBuilder;Ljava/lang/String;CC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
