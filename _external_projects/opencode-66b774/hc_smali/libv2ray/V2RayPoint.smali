.class public final Llibv2ray/V2RayPoint;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lgo/Seq$Proxy;


# instance fields
.field private final refnum:I


# direct methods
.method public static constructor <clinit>()V
    .registers 0

    invoke-static {}, Llibv2ray/Libv2ray;->touch()V

    return-void
.end method

.method public constructor <init>(I)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Llibv2ray/V2RayPoint;->refnum:I

    invoke-static {p1, p0}, Lgo/Seq;->trackGoRef(ILgo/Seq$GoObject;)V

    return-void
.end method

.method public constructor <init>(Llibv2ray/V2RayVPNServiceSupportsSet;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Llibv2ray/V2RayPoint;->__NewV2RayPoint(Llibv2ray/V2RayVPNServiceSupportsSet;)I

    move-result p1

    iput p1, p0, Llibv2ray/V2RayPoint;->refnum:I

    invoke-static {p1, p0}, Lgo/Seq;->trackGoRef(ILgo/Seq$GoObject;)V

    return-void
.end method

.method private static native __NewV2RayPoint(Llibv2ray/V2RayVPNServiceSupportsSet;)I
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .registers 5

    const/4 v0, 0x0

    if-eqz p1, :cond_92

    instance-of v1, p1, Llibv2ray/V2RayPoint;

    if-nez v1, :cond_9

    goto/16 :goto_92

    :cond_9
    check-cast p1, Llibv2ray/V2RayPoint;

    invoke-virtual {p0}, Llibv2ray/V2RayPoint;->getSupportSet()Llibv2ray/V2RayVPNServiceSupportsSet;

    move-result-object v1

    invoke-virtual {p1}, Llibv2ray/V2RayPoint;->getSupportSet()Llibv2ray/V2RayVPNServiceSupportsSet;

    move-result-object v2

    if-nez v1, :cond_18

    if-eqz v2, :cond_1f

    return v0

    :cond_18
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1f

    return v0

    :cond_1f
    invoke-virtual {p0}, Llibv2ray/V2RayPoint;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Llibv2ray/V2RayPoint;->getPackageName()Ljava/lang/String;

    move-result-object v2

    if-nez v1, :cond_2c

    if-eqz v2, :cond_33

    return v0

    :cond_2c
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_33

    return v0

    :cond_33
    invoke-virtual {p0}, Llibv2ray/V2RayPoint;->getPackageCodePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Llibv2ray/V2RayPoint;->getPackageCodePath()Ljava/lang/String;

    move-result-object v2

    if-nez v1, :cond_40

    if-eqz v2, :cond_47

    return v0

    :cond_40
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_47

    return v0

    :cond_47
    invoke-virtual {p0}, Llibv2ray/V2RayPoint;->getDomainName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Llibv2ray/V2RayPoint;->getDomainName()Ljava/lang/String;

    move-result-object v2

    if-nez v1, :cond_54

    if-eqz v2, :cond_5b

    return v0

    :cond_54
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5b

    return v0

    :cond_5b
    invoke-virtual {p0}, Llibv2ray/V2RayPoint;->getConfigureFileContent()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Llibv2ray/V2RayPoint;->getConfigureFileContent()Ljava/lang/String;

    move-result-object v2

    if-nez v1, :cond_68

    if-eqz v2, :cond_6f

    return v0

    :cond_68
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6f

    return v0

    :cond_6f
    invoke-virtual {p0}, Llibv2ray/V2RayPoint;->getEnableLocalDNS()Z

    move-result v1

    invoke-virtual {p1}, Llibv2ray/V2RayPoint;->getEnableLocalDNS()Z

    move-result v2

    if-eq v1, v2, :cond_7a

    return v0

    :cond_7a
    invoke-virtual {p0}, Llibv2ray/V2RayPoint;->getForwardIpv6()Z

    move-result v1

    invoke-virtual {p1}, Llibv2ray/V2RayPoint;->getForwardIpv6()Z

    move-result v2

    if-eq v1, v2, :cond_85

    return v0

    :cond_85
    invoke-virtual {p0}, Llibv2ray/V2RayPoint;->getProxyOnly()Z

    move-result v1

    invoke-virtual {p1}, Llibv2ray/V2RayPoint;->getProxyOnly()Z

    move-result p1

    if-eq v1, p1, :cond_90

    return v0

    :cond_90
    const/4 p1, 0x1

    return p1

    :cond_92
    :goto_92
    return v0
.end method

.method public final native getConfigureFileContent()Ljava/lang/String;
.end method

.method public final native getDomainName()Ljava/lang/String;
.end method

.method public final native getEnableLocalDNS()Z
.end method

.method public final native getForwardIpv6()Z
.end method

.method public native getIsRunning()Z
.end method

.method public native getIsTRunning()Z
.end method

.method public final native getPackageCodePath()Ljava/lang/String;
.end method

.method public final native getPackageName()Ljava/lang/String;
.end method

.method public final native getProxyOnly()Z
.end method

.method public final native getSupportSet()Llibv2ray/V2RayVPNServiceSupportsSet;
.end method

.method public hashCode()I
    .registers 4

    const/16 v0, 0x8

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p0}, Llibv2ray/V2RayPoint;->getSupportSet()Llibv2ray/V2RayVPNServiceSupportsSet;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p0}, Llibv2ray/V2RayPoint;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-virtual {p0}, Llibv2ray/V2RayPoint;->getPackageCodePath()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-virtual {p0}, Llibv2ray/V2RayPoint;->getDomainName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    invoke-virtual {p0}, Llibv2ray/V2RayPoint;->getConfigureFileContent()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    invoke-virtual {p0}, Llibv2ray/V2RayPoint;->getEnableLocalDNS()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    invoke-virtual {p0}, Llibv2ray/V2RayPoint;->getForwardIpv6()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    invoke-virtual {p0}, Llibv2ray/V2RayPoint;->getProxyOnly()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x7

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final incRefnum()I
    .registers 2

    iget v0, p0, Llibv2ray/V2RayPoint;->refnum:I

    invoke-static {v0, p0}, Lgo/Seq;->incGoRef(ILgo/Seq$GoObject;)V

    iget v0, p0, Llibv2ray/V2RayPoint;->refnum:I

    return v0
.end method

.method public native queryStats(Ljava/lang/String;Ljava/lang/String;)J
.end method

.method public native runLoop()V
.end method

.method public final native setConfigureFileContent(Ljava/lang/String;)V
.end method

.method public final native setDomainName(Ljava/lang/String;)V
.end method

.method public final native setEnableLocalDNS(Z)V
.end method

.method public final native setForwardIpv6(Z)V
.end method

.method public final native setPackageCodePath(Ljava/lang/String;)V
.end method

.method public final native setPackageName(Ljava/lang/String;)V
.end method

.method public final native setProxyOnly(Z)V
.end method

.method public final native setSupportSet(Llibv2ray/V2RayVPNServiceSupportsSet;)V
.end method

.method public native stopLoop()V
.end method

.method public toString()Ljava/lang/String;
    .registers 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "V2RayPoint"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "SupportSet:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Llibv2ray/V2RayPoint;->getSupportSet()Llibv2ray/V2RayVPNServiceSupportsSet;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "PackageName:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Llibv2ray/V2RayPoint;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "PackageCodePath:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Llibv2ray/V2RayPoint;->getPackageCodePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "DomainName:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Llibv2ray/V2RayPoint;->getDomainName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "ConfigureFileContent:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Llibv2ray/V2RayPoint;->getConfigureFileContent()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "EnableLocalDNS:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Llibv2ray/V2RayPoint;->getEnableLocalDNS()Z

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "ForwardIpv6:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Llibv2ray/V2RayPoint;->getForwardIpv6()Z

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "ProxyOnly:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Llibv2ray/V2RayPoint;->getProxyOnly()Z

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
