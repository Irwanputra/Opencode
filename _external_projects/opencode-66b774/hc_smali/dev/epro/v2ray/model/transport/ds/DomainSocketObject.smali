.class public Ldev/epro/v2ray/model/transport/ds/DomainSocketObject;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public abstractObject:Z
    .annotation runtime Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぅみぱぎぎ/〺つふすそ;
        value = "abstract"
    .end annotation
.end field

.field public padding:Z

.field public path:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAbstractObject()Z
    .registers 2

    iget-boolean v0, p0, Ldev/epro/v2ray/model/transport/ds/DomainSocketObject;->abstractObject:Z

    return v0
.end method

.method public getPadding()Z
    .registers 2

    iget-boolean v0, p0, Ldev/epro/v2ray/model/transport/ds/DomainSocketObject;->padding:Z

    return v0
.end method

.method public getPath()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/transport/ds/DomainSocketObject;->path:Ljava/lang/String;

    return-object v0
.end method

.method public setAbstractObject(Z)V
    .registers 2

    iput-boolean p1, p0, Ldev/epro/v2ray/model/transport/ds/DomainSocketObject;->abstractObject:Z

    return-void
.end method

.method public setPadding(Z)V
    .registers 2

    iput-boolean p1, p0, Ldev/epro/v2ray/model/transport/ds/DomainSocketObject;->padding:Z

    return-void
.end method

.method public setPath(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/transport/ds/DomainSocketObject;->path:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 5

    const-string v0, "DomainSocketObject{path=\'"

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ldev/epro/v2ray/model/transport/ds/DomainSocketObject;->path:Ljava/lang/String;

    const/16 v2, 0x27

    const-string v3, ", abstractObject="

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-boolean v1, p0, Ldev/epro/v2ray/model/transport/ds/DomainSocketObject;->abstractObject:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", padding="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ldev/epro/v2ray/model/transport/ds/DomainSocketObject;->padding:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
