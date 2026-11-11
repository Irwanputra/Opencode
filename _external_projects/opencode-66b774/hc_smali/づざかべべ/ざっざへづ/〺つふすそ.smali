.class public Lづざかべべ/ざっざへづ/〺つふすそ;
.super Lづざかべべ/ざっざへづ/げつ〴ぬぐ;
.source ""


# instance fields
.field public final 〳ぜぞぜべっ:Ljava/lang/String;

.field public final ぁごぐすすぃ:I

.field public いいにぽつ:I

.field public final づざかべべ:Landroid/os/Parcel;

.field public final なぎぱいぢぎ:I

.field public final びぐびあび:Landroid/util/SparseIntArray;

.field public ぺぁあねじ:I

.field public ぺふねづ〺:I


# direct methods
.method public constructor <init>(Landroid/os/Parcel;)V
    .registers 10

    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v2

    invoke-virtual {p1}, Landroid/os/Parcel;->dataSize()I

    move-result v3

    new-instance v5, Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    invoke-direct {v5}, Lづざかべべ/づざかべべ/げつ〴ぬぐ;-><init>()V

    new-instance v6, Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    invoke-direct {v6}, Lづざかべべ/づざかべべ/げつ〴ぬぐ;-><init>()V

    new-instance v7, Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    invoke-direct {v7}, Lづざかべべ/づざかべべ/げつ〴ぬぐ;-><init>()V

    const-string v4, ""

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v7}, Lづざかべべ/ざっざへづ/〺つふすそ;-><init>(Landroid/os/Parcel;IILjava/lang/String;Lづざかべべ/づざかべべ/げつ〴ぬぐ;Lづざかべべ/づざかべべ/げつ〴ぬぐ;Lづざかべべ/づざかべべ/げつ〴ぬぐ;)V

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;IILjava/lang/String;Lづざかべべ/づざかべべ/げつ〴ぬぐ;Lづざかべべ/づざかべべ/げつ〴ぬぐ;Lづざかべべ/づざかべべ/げつ〴ぬぐ;)V
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Parcel;",
            "II",
            "Ljava/lang/String;",
            "L\u3065\u3056\u304b\u3079\u3079/\u3065\u3056\u304b\u3079\u3079/\u3052\u3064\u3034\u306c\u3050<",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Method;",
            ">;",
            "L\u3065\u3056\u304b\u3079\u3079/\u3065\u3056\u304b\u3079\u3079/\u3052\u3064\u3034\u306c\u3050<",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Method;",
            ">;",
            "L\u3065\u3056\u304b\u3079\u3079/\u3065\u3056\u304b\u3079\u3079/\u3052\u3064\u3034\u306c\u3050<",
            "Ljava/lang/String;",
            "Ljava/lang/Class;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p5, p6, p7}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;-><init>(Lづざかべべ/づざかべべ/げつ〴ぬぐ;Lづざかべべ/づざかべべ/げつ〴ぬぐ;Lづざかべべ/づざかべべ/げつ〴ぬぐ;)V

    new-instance p5, Landroid/util/SparseIntArray;

    invoke-direct {p5}, Landroid/util/SparseIntArray;-><init>()V

    iput-object p5, p0, Lづざかべべ/ざっざへづ/〺つふすそ;->びぐびあび:Landroid/util/SparseIntArray;

    const/4 p5, -0x1

    iput p5, p0, Lづざかべべ/ざっざへづ/〺つふすそ;->ぺぁあねじ:I

    const/4 p6, 0x0

    iput p6, p0, Lづざかべべ/ざっざへづ/〺つふすそ;->いいにぽつ:I

    iput p5, p0, Lづざかべべ/ざっざへづ/〺つふすそ;->ぺふねづ〺:I

    iput-object p1, p0, Lづざかべべ/ざっざへづ/〺つふすそ;->づざかべべ:Landroid/os/Parcel;

    iput p2, p0, Lづざかべべ/ざっざへづ/〺つふすそ;->なぎぱいぢぎ:I

    iput p3, p0, Lづざかべべ/ざっざへづ/〺つふすそ;->ぁごぐすすぃ:I

    iput p2, p0, Lづざかべべ/ざっざへづ/〺つふすそ;->いいにぽつ:I

    iput-object p4, p0, Lづざかべべ/ざっざへづ/〺つふすそ;->〳ぜぞぜべっ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public 〳ぜぞぜべっ()Ljava/lang/CharSequence;
    .registers 3

    sget-object v0, Landroid/text/TextUtils;->CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;

    iget-object v1, p0, Lづざかべべ/ざっざへづ/〺つふすそ;->づざかべべ:Landroid/os/Parcel;

    invoke-interface {v0, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    return-object v0
.end method

.method public 〺つふすそ()Lづざかべべ/ざっざへづ/げつ〴ぬぐ;
    .registers 10

    new-instance v8, Lづざかべべ/ざっざへづ/〺つふすそ;

    iget-object v1, p0, Lづざかべべ/ざっざへづ/〺つふすそ;->づざかべべ:Landroid/os/Parcel;

    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v2

    iget v0, p0, Lづざかべべ/ざっざへづ/〺つふすそ;->いいにぽつ:I

    iget v3, p0, Lづざかべべ/ざっざへづ/〺つふすそ;->なぎぱいぢぎ:I

    if-ne v0, v3, :cond_10

    iget v0, p0, Lづざかべべ/ざっざへづ/〺つふすそ;->ぁごぐすすぃ:I

    :cond_10
    move v3, v0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lづざかべべ/ざっざへづ/〺つふすそ;->〳ぜぞぜべっ:Ljava/lang/String;

    const-string v5, "  "

    invoke-static {v0, v4, v5}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->なぎぱいぢぎ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    iget-object v6, p0, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    iget-object v7, p0, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->くし〴〺ぅ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lづざかべべ/ざっざへづ/〺つふすそ;-><init>(Landroid/os/Parcel;IILjava/lang/String;Lづざかべべ/づざかべべ/げつ〴ぬぐ;Lづざかべべ/づざかべべ/げつ〴ぬぐ;Lづざかべべ/づざかべべ/げつ〴ぬぐ;)V

    return-object v8
.end method

.method public ぁごぐすすぃ()[B
    .registers 3

    iget-object v0, p0, Lづざかべべ/ざっざへづ/〺つふすそ;->づざかべべ:Landroid/os/Parcel;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-gez v0, :cond_a

    const/4 v0, 0x0

    return-object v0

    :cond_a
    new-array v0, v0, [B

    iget-object v1, p0, Lづざかべべ/ざっざへづ/〺つふすそ;->づざかべべ:Landroid/os/Parcel;

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->readByteArray([B)V

    return-object v0
.end method

.method public いいにぽつ()I
    .registers 2

    iget-object v0, p0, Lづざかべべ/ざっざへづ/〺つふすそ;->づざかべべ:Landroid/os/Parcel;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    return v0
.end method

.method public ぇぬぎばつ(I)V
    .registers 4

    invoke-virtual {p0}, Lづざかべべ/ざっざへづ/〺つふすそ;->げつ〴ぬぐ()V

    iput p1, p0, Lづざかべべ/ざっざへづ/〺つふすそ;->ぺぁあねじ:I

    iget-object v0, p0, Lづざかべべ/ざっざへづ/〺つふすそ;->びぐびあび:Landroid/util/SparseIntArray;

    iget-object v1, p0, Lづざかべべ/ざっざへづ/〺つふすそ;->づざかべべ:Landroid/os/Parcel;

    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v1

    invoke-virtual {v0, p1, v1}, Landroid/util/SparseIntArray;->put(II)V

    .line 1
    iget-object v0, p0, Lづざかべべ/ざっざへづ/〺つふすそ;->づざかべべ:Landroid/os/Parcel;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lづざかべべ/ざっざへづ/〺つふすそ;->づざかべべ:Landroid/os/Parcel;

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

.method public ぉざぅち〻(Z)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/ざっざへづ/〺つふすそ;->づざかべべ:Landroid/os/Parcel;

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

.method public げつ〴ぬぐ()V
    .registers 5

    iget v0, p0, Lづざかべべ/ざっざへづ/〺つふすそ;->ぺぁあねじ:I

    if-ltz v0, :cond_21

    iget-object v1, p0, Lづざかべべ/ざっざへづ/〺つふすそ;->びぐびあび:Landroid/util/SparseIntArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseIntArray;->get(I)I

    move-result v0

    iget-object v1, p0, Lづざかべべ/ざっざへづ/〺つふすそ;->づざかべべ:Landroid/os/Parcel;

    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v1

    sub-int v2, v1, v0

    iget-object v3, p0, Lづざかべべ/ざっざへづ/〺つふすそ;->づざかべべ:Landroid/os/Parcel;

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->setDataPosition(I)V

    iget-object v0, p0, Lづざかべべ/ざっざへづ/〺つふすそ;->づざかべべ:Landroid/os/Parcel;

    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lづざかべべ/ざっざへづ/〺つふすそ;->づざかべべ:Landroid/os/Parcel;

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->setDataPosition(I)V

    :cond_21
    return-void
.end method

.method public ごづごきえ(I)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/ざっざへづ/〺つふすそ;->づざかべべ:Landroid/os/Parcel;

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

.method public ざっざへづ(Landroid/os/Parcelable;)V
    .registers 4

    iget-object v0, p0, Lづざかべべ/ざっざへづ/〺つふすそ;->づざかべべ:Landroid/os/Parcel;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method

.method public ざとぅぼこ〺([B)V
    .registers 4

    if-eqz p1, :cond_e

    iget-object v0, p0, Lづざかべべ/ざっざへづ/〺つふすそ;->づざかべべ:Landroid/os/Parcel;

    array-length v1, p1

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lづざかべべ/ざっざへづ/〺つふすそ;->づざかべべ:Landroid/os/Parcel;

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeByteArray([B)V

    goto :goto_14

    :cond_e
    iget-object p1, p0, Lづざかべべ/ざっざへづ/〺つふすそ;->づざかべべ:Landroid/os/Parcel;

    const/4 v0, -0x1

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    :goto_14
    return-void
.end method

.method public てぜきぽく()Landroid/os/Parcelable;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Landroid/os/Parcelable;",
            ">()TT;"
        }
    .end annotation

    iget-object v0, p0, Lづざかべべ/ざっざへづ/〺つふすそ;->づざかべべ:Landroid/os/Parcel;

    const-class v1, Lづざかべべ/ざっざへづ/〺つふすそ;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    return-object v0
.end method

.method public でどあくず(Ljava/lang/String;)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/ざっざへづ/〺つふすそ;->づざかべべ:Landroid/os/Parcel;

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method

.method public なぎぱいぢぎ()Z
    .registers 2

    iget-object v0, p0, Lづざかべべ/ざっざへづ/〺つふすそ;->づざかべべ:Landroid/os/Parcel;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_a

    const/4 v0, 0x1

    goto :goto_b

    :cond_a
    const/4 v0, 0x0

    :goto_b
    return v0
.end method

.method public は〲ぱなで(Ljava/lang/CharSequence;)V
    .registers 4

    iget-object v0, p0, Lづざかべべ/ざっざへづ/〺つふすそ;->づざかべべ:Landroid/os/Parcel;

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Landroid/text/TextUtils;->writeToParcel(Ljava/lang/CharSequence;Landroid/os/Parcel;I)V

    return-void
.end method

.method public へぬ〴づぞ()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lづざかべべ/ざっざへづ/〺つふすそ;->づざかべべ:Landroid/os/Parcel;

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ぺぁあねじ(I)Z
    .registers 6

    :goto_0
    iget v0, p0, Lづざかべべ/ざっざへづ/〺つふすそ;->いいにぽつ:I

    iget v1, p0, Lづざかべべ/ざっざへづ/〺つふすそ;->ぁごぐすすぃ:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ge v0, v1, :cond_37

    iget v0, p0, Lづざかべべ/ざっざへづ/〺つふすそ;->ぺふねづ〺:I

    if-ne v0, p1, :cond_d

    return v2

    :cond_d
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_1c

    return v3

    :cond_1c
    iget-object v0, p0, Lづざかべべ/ざっざへづ/〺つふすそ;->づざかべべ:Landroid/os/Parcel;

    iget v1, p0, Lづざかべべ/ざっざへづ/〺つふすそ;->いいにぽつ:I

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->setDataPosition(I)V

    iget-object v0, p0, Lづざかべべ/ざっざへづ/〺つふすそ;->づざかべべ:Landroid/os/Parcel;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iget-object v1, p0, Lづざかべべ/ざっざへづ/〺つふすそ;->づざかべべ:Landroid/os/Parcel;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lづざかべべ/ざっざへづ/〺つふすそ;->ぺふねづ〺:I

    iget v1, p0, Lづざかべべ/ざっざへづ/〺つふすそ;->いいにぽつ:I

    add-int/2addr v1, v0

    iput v1, p0, Lづざかべべ/ざっざへづ/〺つふすそ;->いいにぽつ:I

    goto :goto_0

    :cond_37
    iget v0, p0, Lづざかべべ/ざっざへづ/〺つふすそ;->ぺふねづ〺:I

    if-ne v0, p1, :cond_3c

    goto :goto_3d

    :cond_3c
    const/4 v2, 0x0

    :goto_3d
    return v2
.end method
