.class public final Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final づざかべべ:Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;


# instance fields
.field public final 〺つふすそ:I

.field public final くし〴〺ぅ:I

.field public final げつ〴ぬぐ:I

.field public final びぐびあび:I


# direct methods
.method public static constructor <clinit>()V
    .registers 2

    new-instance v0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, v1, v1}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;-><init>(IIII)V

    sput-object v0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;->づざかべべ:Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;

    return-void
.end method

.method public constructor <init>(IIII)V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;->げつ〴ぬぐ:I

    iput p2, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;->〺つふすそ:I

    iput p3, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;->くし〴〺ぅ:I

    iput p4, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;->びぐびあび:I

    return-void
.end method

.method public static げつ〴ぬぐ(IIII)Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;
    .registers 5

    if-nez p0, :cond_b

    if-nez p1, :cond_b

    if-nez p2, :cond_b

    if-nez p3, :cond_b

    sget-object p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;->づざかべべ:Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;

    return-object p0

    :cond_b
    new-instance v0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;

    invoke-direct {v0, p0, p1, p2, p3}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;-><init>(IIII)V

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .registers 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    const/4 v1, 0x0

    if-eqz p1, :cond_2f

    const-class v2, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_10

    goto :goto_2f

    :cond_10
    check-cast p1, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;

    iget v2, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;->びぐびあび:I

    iget v3, p1, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;->びぐびあび:I

    if-eq v2, v3, :cond_19

    return v1

    :cond_19
    iget v2, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;->げつ〴ぬぐ:I

    iget v3, p1, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;->げつ〴ぬぐ:I

    if-eq v2, v3, :cond_20

    return v1

    :cond_20
    iget v2, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;->くし〴〺ぅ:I

    iget v3, p1, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;->くし〴〺ぅ:I

    if-eq v2, v3, :cond_27

    return v1

    :cond_27
    iget v2, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;->〺つふすそ:I

    iget p1, p1, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;->〺つふすそ:I

    if-eq v2, p1, :cond_2e

    return v1

    :cond_2e
    return v0

    :cond_2f
    :goto_2f
    return v1
.end method

.method public hashCode()I
    .registers 3

    iget v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;->げつ〴ぬぐ:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;->〺つふすそ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;->くし〴〺ぅ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;->びぐびあび:I

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .registers 4

    const-string v0, "Insets{left="

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;->げつ〴ぬぐ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", top="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;->〺つふすそ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", right="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;->くし〴〺ぅ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", bottom="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;->びぐびあび:I

    const/16 v2, 0x7d

    invoke-static {v0, v1, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びぐびあび(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
