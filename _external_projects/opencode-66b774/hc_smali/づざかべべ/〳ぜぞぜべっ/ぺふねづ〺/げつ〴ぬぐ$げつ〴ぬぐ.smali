.class public Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# static fields
.field public static final づざかべべ:[B


# instance fields
.field public final 〺つふすそ:I

.field public くし〴〺ぅ:I

.field public final げつ〴ぬぐ:Ljava/lang/CharSequence;

.field public びぐびあび:C


# direct methods
.method public static constructor <clinit>()V
    .registers 4

    const/16 v0, 0x700

    new-array v1, v0, [B

    sput-object v1, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ$げつ〴ぬぐ;->づざかべべ:[B

    const/4 v1, 0x0

    :goto_7
    if-ge v1, v0, :cond_14

    sget-object v2, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ$げつ〴ぬぐ;->づざかべべ:[B

    invoke-static {v1}, Ljava/lang/Character;->getDirectionality(I)B

    move-result v3

    aput-byte v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    :cond_14
    return-void
.end method

.method public constructor <init>(Ljava/lang/CharSequence;Z)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/CharSequence;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    iput p1, p0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ$げつ〴ぬぐ;->〺つふすそ:I

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ()B
    .registers 4

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/CharSequence;

    iget v1, p0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ$げつ〴ぬぐ;->くし〴〺ぅ:I

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    iput-char v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ$げつ〴ぬぐ;->びぐびあび:C

    invoke-static {v0}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v0

    if-eqz v0, :cond_28

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/CharSequence;

    iget v1, p0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ$げつ〴ぬぐ;->くし〴〺ぅ:I

    invoke-static {v0, v1}, Ljava/lang/Character;->codePointBefore(Ljava/lang/CharSequence;I)I

    move-result v0

    iget v1, p0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ$げつ〴ぬぐ;->くし〴〺ぅ:I

    invoke-static {v0}, Ljava/lang/Character;->charCount(I)I

    move-result v2

    sub-int/2addr v1, v2

    iput v1, p0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ$げつ〴ぬぐ;->くし〴〺ぅ:I

    invoke-static {v0}, Ljava/lang/Character;->getDirectionality(I)B

    move-result v0

    return v0

    :cond_28
    iget v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ$げつ〴ぬぐ;->くし〴〺ぅ:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ$げつ〴ぬぐ;->くし〴〺ぅ:I

    iget-char v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ$げつ〴ぬぐ;->びぐびあび:C

    const/16 v1, 0x700

    if-ge v0, v1, :cond_39

    .line 1
    sget-object v1, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ$げつ〴ぬぐ;->づざかべべ:[B

    aget-byte v0, v1, v0

    goto :goto_3d

    :cond_39
    invoke-static {v0}, Ljava/lang/Character;->getDirectionality(C)B

    move-result v0

    :goto_3d
    return v0
.end method
