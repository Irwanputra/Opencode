.class public Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519ScalarOps;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lnet/i2p/crypto/eddsa/math/ScalarOps;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public multiplyAndAdd([B[B[B)[B
    .registers 87

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    const/4 v3, 0x0

    invoke-static {v0, v3}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_3([BI)I

    move-result v4

    const v5, 0x1fffff

    and-int/2addr v4, v5

    int-to-long v6, v4

    const/4 v4, 0x2

    invoke-static {v0, v4}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_4([BI)J

    move-result-wide v8

    const/4 v10, 0x5

    shr-long/2addr v8, v10

    const-wide/32 v11, 0x1fffff

    and-long/2addr v8, v11

    invoke-static {v0, v10}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_3([BI)I

    move-result v13

    shr-int/2addr v13, v4

    and-int/2addr v13, v5

    int-to-long v13, v13

    const/4 v15, 0x7

    invoke-static {v0, v15}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_4([BI)J

    move-result-wide v16

    shr-long v16, v16, v15

    and-long v16, v16, v11

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_4([BI)J

    move-result-wide v18

    const/16 v20, 0x4

    shr-long v18, v18, v20

    and-long v18, v18, v11

    const/16 v3, 0xd

    invoke-static {v0, v3}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_3([BI)I

    move-result v21

    const/16 v22, 0x1

    shr-int/lit8 v21, v21, 0x1

    and-int v3, v21, v5

    int-to-long v4, v3

    const/16 v3, 0xf

    invoke-static {v0, v3}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_4([BI)J

    move-result-wide v24

    const/16 v26, 0x6

    shr-long v24, v24, v26

    and-long v24, v24, v11

    const/16 v3, 0x12

    invoke-static {v0, v3}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_3([BI)I

    move-result v27

    const/16 v28, 0x3

    shr-int/lit8 v27, v27, 0x3

    const v21, 0x1fffff

    and-int v3, v27, v21

    int-to-long v11, v3

    const/16 v3, 0x15

    invoke-static {v0, v3}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_3([BI)I

    move-result v27

    and-int v3, v27, v21

    move-wide/from16 v31, v11

    int-to-long v10, v3

    const/16 v3, 0x17

    invoke-static {v0, v3}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_4([BI)J

    move-result-wide v33

    const/4 v3, 0x5

    shr-long v33, v33, v3

    const-wide/32 v29, 0x1fffff

    and-long v33, v33, v29

    const/16 v3, 0x1a

    invoke-static {v0, v3}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_3([BI)I

    move-result v3

    const/4 v12, 0x2

    shr-int/2addr v3, v12

    and-int v3, v3, v21

    move-wide/from16 v35, v13

    int-to-long v12, v3

    const/16 v3, 0x1c

    invoke-static {v0, v3}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_4([BI)J

    move-result-wide v37

    shr-long v37, v37, v15

    const/4 v0, 0x0

    invoke-static {v1, v0}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_3([BI)I

    move-result v3

    and-int v0, v3, v21

    move-wide/from16 v39, v12

    int-to-long v12, v0

    const/4 v0, 0x2

    invoke-static {v1, v0}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_4([BI)J

    move-result-wide v41

    const/4 v3, 0x5

    shr-long v41, v41, v3

    const-wide/32 v29, 0x1fffff

    and-long v41, v41, v29

    invoke-static {v1, v3}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_3([BI)I

    move-result v14

    shr-int/lit8 v3, v14, 0x2

    and-int v0, v3, v21

    move-wide/from16 v43, v10

    int-to-long v10, v0

    invoke-static {v1, v15}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_4([BI)J

    move-result-wide v45

    shr-long v45, v45, v15

    and-long v45, v45, v29

    const/16 v0, 0xa

    invoke-static {v1, v0}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_4([BI)J

    move-result-wide v47

    shr-long v47, v47, v20

    and-long v47, v47, v29

    const/16 v0, 0xd

    invoke-static {v1, v0}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_3([BI)I

    move-result v3

    shr-int/lit8 v0, v3, 0x1

    and-int v0, v0, v21

    move-wide/from16 v49, v4

    int-to-long v3, v0

    const/16 v0, 0xf

    invoke-static {v1, v0}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_4([BI)J

    move-result-wide v51

    shr-long v51, v51, v26

    and-long v51, v51, v29

    const/16 v0, 0x12

    invoke-static {v1, v0}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_3([BI)I

    move-result v5

    shr-int/lit8 v0, v5, 0x3

    and-int v0, v0, v21

    move-wide/from16 v53, v3

    int-to-long v3, v0

    const/16 v0, 0x15

    invoke-static {v1, v0}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_3([BI)I

    move-result v5

    and-int v0, v5, v21

    move-wide/from16 v55, v3

    int-to-long v3, v0

    const/16 v0, 0x17

    invoke-static {v1, v0}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_4([BI)J

    move-result-wide v57

    const/4 v0, 0x5

    shr-long v57, v57, v0

    and-long v57, v57, v29

    const/16 v0, 0x1a

    invoke-static {v1, v0}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_3([BI)I

    move-result v0

    const/4 v5, 0x2

    shr-int/2addr v0, v5

    and-int v0, v0, v21

    move-wide/from16 v59, v6

    int-to-long v5, v0

    const/16 v0, 0x1c

    invoke-static {v1, v0}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_4([BI)J

    move-result-wide v0

    shr-long/2addr v0, v15

    const/4 v7, 0x0

    invoke-static {v2, v7}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_3([BI)I

    move-result v14

    and-int v7, v14, v21

    move-wide/from16 p1, v0

    int-to-long v0, v7

    const/4 v7, 0x2

    invoke-static {v2, v7}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_4([BI)J

    move-result-wide v61

    const/4 v14, 0x5

    shr-long v61, v61, v14

    const-wide/32 v29, 0x1fffff

    and-long v61, v61, v29

    invoke-static {v2, v14}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_3([BI)I

    move-result v23

    shr-int/lit8 v14, v23, 0x2

    and-int v7, v14, v21

    move-wide/from16 v63, v5

    int-to-long v5, v7

    invoke-static {v2, v15}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_4([BI)J

    move-result-wide v65

    shr-long v65, v65, v15

    and-long v65, v65, v29

    const/16 v7, 0xa

    invoke-static {v2, v7}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_4([BI)J

    move-result-wide v67

    shr-long v67, v67, v20

    and-long v67, v67, v29

    const/16 v7, 0xd

    invoke-static {v2, v7}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_3([BI)I

    move-result v14

    shr-int/lit8 v7, v14, 0x1

    and-int v7, v7, v21

    move-wide/from16 v69, v3

    int-to-long v3, v7

    const/16 v7, 0xf

    invoke-static {v2, v7}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_4([BI)J

    move-result-wide v71

    shr-long v71, v71, v26

    and-long v71, v71, v29

    const/16 v7, 0x12

    invoke-static {v2, v7}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_3([BI)I

    move-result v14

    shr-int/lit8 v7, v14, 0x3

    and-int v7, v7, v21

    move-wide/from16 v73, v3

    int-to-long v3, v7

    const/16 v7, 0x15

    invoke-static {v2, v7}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_3([BI)I

    move-result v14

    and-int v7, v14, v21

    move-wide/from16 v75, v3

    int-to-long v3, v7

    const/16 v7, 0x17

    invoke-static {v2, v7}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_4([BI)J

    move-result-wide v77

    const/4 v7, 0x5

    shr-long v77, v77, v7

    and-long v29, v77, v29

    const/16 v7, 0x1a

    invoke-static {v2, v7}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_3([BI)I

    move-result v7

    const/4 v14, 0x2

    shr-int/2addr v7, v14

    and-int v7, v7, v21

    move-wide/from16 v77, v3

    int-to-long v3, v7

    const/16 v7, 0x1c

    invoke-static {v2, v7}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_4([BI)J

    move-result-wide v79

    shr-long v79, v79, v15

    mul-long v81, v59, v12

    add-long v81, v81, v0

    mul-long v0, v59, v41

    add-long v0, v0, v61

    mul-long v61, v8, v12

    add-long v61, v61, v0

    mul-long v0, v59, v10

    add-long/2addr v0, v5

    mul-long v5, v8, v41

    add-long/2addr v5, v0

    mul-long v0, v35, v12

    add-long/2addr v0, v5

    mul-long v6, v59, v45

    add-long v6, v6, v65

    mul-long v65, v8, v10

    add-long v65, v65, v6

    mul-long v5, v35, v41

    add-long v5, v5, v65

    mul-long v65, v16, v12

    add-long v65, v65, v5

    mul-long v6, v59, v47

    add-long v6, v6, v67

    mul-long v67, v8, v45

    add-long v67, v67, v6

    mul-long v5, v35, v10

    add-long v5, v5, v67

    mul-long v67, v16, v41

    add-long v67, v67, v5

    mul-long v5, v18, v12

    add-long v5, v5, v67

    mul-long v67, v59, v53

    add-long v67, v67, v73

    mul-long v73, v8, v47

    add-long v73, v73, v67

    mul-long v67, v35, v45

    add-long v67, v67, v73

    mul-long v73, v16, v10

    add-long v73, v73, v67

    mul-long v67, v18, v41

    add-long v67, v67, v73

    mul-long v73, v49, v12

    add-long v73, v73, v67

    mul-long v67, v59, v51

    add-long v67, v67, v71

    mul-long v71, v8, v53

    add-long v71, v71, v67

    mul-long v67, v35, v47

    add-long v67, v67, v71

    mul-long v71, v16, v45

    add-long v71, v71, v67

    mul-long v67, v18, v10

    add-long v67, v67, v71

    mul-long v71, v49, v41

    add-long v71, v71, v67

    mul-long v67, v24, v12

    add-long v67, v67, v71

    mul-long v71, v59, v55

    add-long v71, v71, v75

    mul-long v75, v8, v51

    add-long v75, v75, v71

    mul-long v71, v35, v53

    add-long v71, v71, v75

    mul-long v75, v16, v47

    add-long v75, v75, v71

    mul-long v71, v18, v45

    add-long v71, v71, v75

    mul-long v75, v49, v10

    add-long v75, v75, v71

    mul-long v71, v24, v41

    add-long v71, v71, v75

    mul-long v75, v31, v12

    add-long v75, v75, v71

    mul-long v71, v59, v69

    add-long v71, v71, v77

    mul-long v77, v8, v55

    add-long v77, v77, v71

    mul-long v71, v35, v51

    add-long v71, v71, v77

    mul-long v77, v16, v53

    add-long v77, v77, v71

    mul-long v71, v18, v47

    add-long v71, v71, v77

    mul-long v77, v49, v45

    add-long v77, v77, v71

    mul-long v71, v24, v10

    add-long v71, v71, v77

    mul-long v77, v31, v41

    add-long v77, v77, v71

    mul-long v71, v43, v12

    add-long v71, v71, v77

    mul-long v77, v59, v57

    add-long v77, v77, v29

    mul-long v29, v8, v69

    add-long v29, v29, v77

    mul-long v77, v35, v55

    add-long v77, v77, v29

    mul-long v29, v16, v51

    add-long v29, v29, v77

    mul-long v77, v18, v53

    add-long v77, v77, v29

    mul-long v29, v49, v47

    add-long v29, v29, v77

    mul-long v77, v24, v45

    add-long v77, v77, v29

    mul-long v29, v31, v10

    add-long v29, v29, v77

    mul-long v77, v43, v41

    add-long v77, v77, v29

    mul-long v29, v33, v12

    add-long v29, v29, v77

    mul-long v77, v59, v63

    add-long v77, v77, v3

    mul-long v2, v8, v57

    add-long v2, v2, v77

    mul-long v77, v35, v69

    add-long v77, v77, v2

    mul-long v3, v16, v55

    add-long v3, v3, v77

    mul-long v77, v18, v51

    add-long v77, v77, v3

    mul-long v2, v49, v53

    add-long v2, v2, v77

    mul-long v77, v24, v47

    add-long v77, v77, v2

    mul-long v2, v31, v45

    add-long v2, v2, v77

    mul-long v77, v43, v10

    add-long v77, v77, v2

    mul-long v2, v33, v41

    add-long v2, v2, v77

    mul-long v77, v39, v12

    add-long v77, v77, v2

    move-wide/from16 v2, p1

    mul-long v59, v59, v2

    add-long v59, v59, v79

    mul-long v79, v8, v63

    add-long v79, v79, v59

    mul-long v59, v35, v57

    add-long v59, v59, v79

    mul-long v79, v16, v69

    add-long v79, v79, v59

    mul-long v59, v18, v55

    add-long v59, v59, v79

    mul-long v79, v49, v51

    add-long v79, v79, v59

    mul-long v59, v24, v53

    add-long v59, v59, v79

    mul-long v79, v31, v47

    add-long v79, v79, v59

    mul-long v59, v43, v45

    add-long v59, v59, v79

    mul-long v79, v33, v10

    add-long v79, v79, v59

    mul-long v59, v39, v41

    add-long v59, v59, v79

    mul-long v12, v12, v37

    add-long v12, v12, v59

    mul-long v8, v8, v2

    mul-long v59, v35, v63

    add-long v59, v59, v8

    mul-long v7, v16, v57

    add-long v7, v7, v59

    mul-long v59, v18, v69

    add-long v59, v59, v7

    mul-long v7, v49, v55

    add-long v7, v7, v59

    mul-long v59, v24, v51

    add-long v59, v59, v7

    mul-long v7, v31, v53

    add-long v7, v7, v59

    mul-long v59, v43, v47

    add-long v59, v59, v7

    mul-long v7, v33, v45

    add-long v7, v7, v59

    mul-long v59, v39, v10

    add-long v59, v59, v7

    mul-long v41, v41, v37

    add-long v41, v41, v59

    mul-long v7, v35, v2

    mul-long v35, v16, v63

    add-long v35, v35, v7

    mul-long v7, v18, v57

    add-long v7, v7, v35

    mul-long v35, v49, v69

    add-long v35, v35, v7

    mul-long v7, v24, v55

    add-long v7, v7, v35

    mul-long v35, v31, v51

    add-long v35, v35, v7

    mul-long v7, v43, v53

    add-long v7, v7, v35

    mul-long v35, v33, v47

    add-long v35, v35, v7

    mul-long v7, v39, v45

    add-long v7, v7, v35

    mul-long v10, v10, v37

    add-long/2addr v10, v7

    mul-long v16, v16, v2

    mul-long v7, v18, v63

    add-long v7, v7, v16

    mul-long v16, v49, v57

    add-long v16, v16, v7

    mul-long v7, v24, v69

    add-long v7, v7, v16

    mul-long v16, v31, v55

    add-long v16, v16, v7

    mul-long v7, v43, v51

    add-long v7, v7, v16

    mul-long v16, v33, v53

    add-long v16, v16, v7

    mul-long v7, v39, v47

    add-long v7, v7, v16

    mul-long v45, v45, v37

    add-long v45, v45, v7

    mul-long v18, v18, v2

    mul-long v7, v49, v63

    add-long v7, v7, v18

    mul-long v16, v24, v57

    add-long v16, v16, v7

    mul-long v7, v31, v69

    add-long v7, v7, v16

    mul-long v16, v43, v55

    add-long v16, v16, v7

    mul-long v7, v33, v51

    add-long v7, v7, v16

    mul-long v16, v39, v53

    add-long v16, v16, v7

    mul-long v47, v47, v37

    add-long v47, v47, v16

    mul-long v7, v49, v2

    mul-long v16, v24, v63

    add-long v16, v16, v7

    mul-long v7, v31, v57

    add-long v7, v7, v16

    mul-long v16, v43, v69

    add-long v16, v16, v7

    mul-long v7, v33, v55

    add-long v7, v7, v16

    mul-long v16, v39, v51

    add-long v16, v16, v7

    mul-long v7, v37, v53

    add-long v7, v7, v16

    mul-long v24, v24, v2

    mul-long v16, v31, v63

    add-long v16, v16, v24

    mul-long v18, v43, v57

    add-long v18, v18, v16

    mul-long v16, v33, v69

    add-long v16, v16, v18

    mul-long v18, v39, v55

    add-long v18, v18, v16

    mul-long v51, v51, v37

    add-long v51, v51, v18

    mul-long v16, v31, v2

    mul-long v18, v43, v63

    add-long v18, v18, v16

    mul-long v16, v33, v57

    add-long v16, v16, v18

    mul-long v18, v39, v69

    add-long v18, v18, v16

    mul-long v16, v37, v55

    add-long v16, v16, v18

    mul-long v18, v43, v2

    mul-long v24, v33, v63

    add-long v24, v24, v18

    mul-long v18, v39, v57

    add-long v18, v18, v24

    mul-long v24, v37, v69

    add-long v24, v24, v18

    mul-long v33, v33, v2

    mul-long v18, v39, v63

    add-long v18, v18, v33

    mul-long v57, v57, v37

    add-long v57, v57, v18

    mul-long v18, v39, v2

    mul-long v31, v37, v63

    add-long v31, v31, v18

    mul-long v37, v37, v2

    const-wide/32 v2, 0x100000

    add-long v18, v81, v2

    const/16 v4, 0x15

    shr-long v18, v18, v4

    add-long v61, v61, v18

    shl-long v18, v18, v4

    sub-long v81, v81, v18

    add-long v18, v0, v2

    shr-long v18, v18, v4

    add-long v65, v65, v18

    shl-long v18, v18, v4

    sub-long v0, v0, v18

    add-long v18, v5, v2

    shr-long v18, v18, v4

    add-long v73, v73, v18

    shl-long v18, v18, v4

    sub-long v5, v5, v18

    add-long v18, v67, v2

    shr-long v18, v18, v4

    add-long v75, v75, v18

    shl-long v18, v18, v4

    sub-long v67, v67, v18

    add-long v18, v71, v2

    shr-long v18, v18, v4

    add-long v29, v29, v18

    shl-long v18, v18, v4

    sub-long v71, v71, v18

    add-long v18, v77, v2

    shr-long v18, v18, v4

    add-long v12, v12, v18

    shl-long v18, v18, v4

    sub-long v77, v77, v18

    add-long v18, v41, v2

    shr-long v18, v18, v4

    add-long v10, v10, v18

    shl-long v18, v18, v4

    sub-long v41, v41, v18

    add-long v18, v45, v2

    shr-long v18, v18, v4

    add-long v47, v47, v18

    shl-long v18, v18, v4

    sub-long v45, v45, v18

    add-long v18, v7, v2

    shr-long v18, v18, v4

    add-long v51, v51, v18

    shl-long v18, v18, v4

    sub-long v7, v7, v18

    add-long v18, v16, v2

    shr-long v18, v18, v4

    add-long v24, v24, v18

    shl-long v18, v18, v4

    sub-long v16, v16, v18

    add-long v18, v57, v2

    shr-long v18, v18, v4

    add-long v31, v31, v18

    shl-long v18, v18, v4

    sub-long v57, v57, v18

    add-long v18, v37, v2

    shr-long v18, v18, v4

    shl-long v33, v18, v4

    sub-long v37, v37, v33

    add-long v33, v61, v2

    shr-long v33, v33, v4

    add-long v0, v0, v33

    shl-long v33, v33, v4

    sub-long v61, v61, v33

    add-long v33, v65, v2

    shr-long v33, v33, v4

    add-long v5, v5, v33

    shl-long v33, v33, v4

    sub-long v65, v65, v33

    add-long v33, v73, v2

    shr-long v33, v33, v4

    add-long v67, v67, v33

    shl-long v33, v33, v4

    sub-long v73, v73, v33

    add-long v33, v75, v2

    shr-long v33, v33, v4

    add-long v71, v71, v33

    shl-long v33, v33, v4

    sub-long v75, v75, v33

    add-long v33, v29, v2

    shr-long v33, v33, v4

    add-long v77, v77, v33

    shl-long v33, v33, v4

    sub-long v29, v29, v33

    add-long v33, v12, v2

    shr-long v33, v33, v4

    add-long v41, v41, v33

    shl-long v33, v33, v4

    sub-long v12, v12, v33

    add-long v33, v10, v2

    shr-long v33, v33, v4

    add-long v45, v45, v33

    shl-long v33, v33, v4

    sub-long v10, v10, v33

    add-long v33, v47, v2

    shr-long v33, v33, v4

    add-long v7, v7, v33

    shl-long v33, v33, v4

    sub-long v47, v47, v33

    add-long v33, v51, v2

    shr-long v33, v33, v4

    add-long v16, v16, v33

    shl-long v33, v33, v4

    sub-long v51, v51, v33

    add-long v33, v24, v2

    shr-long v33, v33, v4

    add-long v57, v57, v33

    shl-long v33, v33, v4

    sub-long v24, v24, v33

    add-long v33, v31, v2

    shr-long v33, v33, v4

    add-long v37, v37, v33

    shl-long v33, v33, v4

    sub-long v31, v31, v33

    const-wide/32 v33, 0xa2c13

    mul-long v35, v18, v33

    add-long v35, v35, v12

    const-wide/32 v12, 0x72d18

    mul-long v39, v18, v12

    add-long v39, v39, v41

    const-wide/32 v41, 0x9fb67

    mul-long v43, v18, v41

    add-long v43, v43, v10

    const-wide/32 v9, 0xf39ad

    mul-long v49, v18, v9

    sub-long v45, v45, v49

    const-wide/32 v49, 0x215d1

    mul-long v53, v18, v49

    add-long v53, v53, v47

    const-wide/32 v47, 0xa6f7d

    mul-long v18, v18, v47

    sub-long v7, v7, v18

    mul-long v18, v37, v33

    add-long v18, v18, v77

    mul-long v55, v37, v12

    add-long v55, v55, v35

    mul-long v35, v37, v41

    add-long v35, v35, v39

    mul-long v39, v37, v9

    sub-long v43, v43, v39

    mul-long v39, v37, v49

    add-long v39, v39, v45

    mul-long v37, v37, v47

    sub-long v53, v53, v37

    mul-long v37, v31, v33

    add-long v37, v37, v29

    mul-long v29, v31, v12

    add-long v29, v29, v18

    mul-long v18, v31, v41

    add-long v18, v18, v55

    mul-long v45, v31, v9

    sub-long v35, v35, v45

    mul-long v45, v31, v49

    add-long v45, v45, v43

    mul-long v31, v31, v47

    sub-long v39, v39, v31

    mul-long v31, v57, v33

    add-long v31, v31, v71

    mul-long v43, v57, v12

    add-long v43, v43, v37

    mul-long v37, v57, v41

    add-long v37, v37, v29

    mul-long v29, v57, v9

    sub-long v18, v18, v29

    mul-long v29, v57, v49

    add-long v29, v29, v35

    mul-long v57, v57, v47

    sub-long v45, v45, v57

    mul-long v35, v24, v33

    add-long v35, v35, v75

    mul-long v55, v24, v12

    add-long v55, v55, v31

    mul-long v31, v24, v41

    add-long v31, v31, v43

    mul-long v43, v24, v9

    sub-long v37, v37, v43

    mul-long v43, v24, v49

    add-long v43, v43, v18

    mul-long v24, v24, v47

    sub-long v29, v29, v24

    mul-long v18, v16, v33

    add-long v18, v18, v67

    mul-long v24, v16, v12

    add-long v24, v24, v35

    mul-long v35, v16, v41

    add-long v35, v35, v55

    mul-long v55, v16, v9

    sub-long v31, v31, v55

    mul-long v55, v16, v49

    add-long v55, v55, v37

    mul-long v16, v16, v47

    sub-long v43, v43, v16

    add-long v16, v18, v2

    const/16 v4, 0x15

    shr-long v16, v16, v4

    add-long v24, v24, v16

    shl-long v16, v16, v4

    sub-long v18, v18, v16

    add-long v16, v35, v2

    shr-long v16, v16, v4

    add-long v31, v31, v16

    shl-long v16, v16, v4

    sub-long v35, v35, v16

    add-long v16, v55, v2

    shr-long v16, v16, v4

    add-long v43, v43, v16

    shl-long v16, v16, v4

    sub-long v55, v55, v16

    add-long v16, v29, v2

    shr-long v16, v16, v4

    add-long v45, v45, v16

    shl-long v16, v16, v4

    sub-long v29, v29, v16

    add-long v16, v39, v2

    shr-long v16, v16, v4

    add-long v53, v53, v16

    shl-long v16, v16, v4

    sub-long v39, v39, v16

    add-long v16, v7, v2

    shr-long v16, v16, v4

    add-long v51, v51, v16

    shl-long v16, v16, v4

    sub-long v7, v7, v16

    add-long v16, v24, v2

    shr-long v16, v16, v4

    add-long v35, v35, v16

    shl-long v16, v16, v4

    sub-long v24, v24, v16

    add-long v16, v31, v2

    shr-long v16, v16, v4

    add-long v55, v55, v16

    shl-long v16, v16, v4

    sub-long v31, v31, v16

    add-long v16, v43, v2

    shr-long v16, v16, v4

    add-long v29, v29, v16

    shl-long v16, v16, v4

    sub-long v43, v43, v16

    add-long v16, v45, v2

    shr-long v16, v16, v4

    add-long v39, v39, v16

    shl-long v16, v16, v4

    sub-long v45, v45, v16

    add-long v16, v53, v2

    shr-long v16, v16, v4

    add-long v7, v7, v16

    shl-long v16, v16, v4

    sub-long v53, v53, v16

    mul-long v16, v51, v33

    add-long v16, v16, v73

    mul-long v37, v51, v12

    add-long v37, v37, v18

    mul-long v18, v51, v41

    add-long v18, v18, v24

    mul-long v24, v51, v9

    sub-long v35, v35, v24

    mul-long v24, v51, v49

    add-long v24, v24, v31

    mul-long v51, v51, v47

    sub-long v55, v55, v51

    mul-long v31, v7, v33

    add-long v31, v31, v5

    mul-long v4, v7, v12

    add-long v4, v4, v16

    mul-long v16, v7, v41

    add-long v16, v16, v37

    mul-long v37, v7, v9

    sub-long v18, v18, v37

    mul-long v37, v7, v49

    add-long v37, v37, v35

    mul-long v7, v7, v47

    sub-long v24, v24, v7

    mul-long v6, v53, v33

    add-long v6, v6, v65

    mul-long v35, v53, v12

    add-long v35, v35, v31

    mul-long v31, v53, v41

    add-long v31, v31, v4

    mul-long v4, v53, v9

    sub-long v16, v16, v4

    mul-long v4, v53, v49

    add-long v4, v4, v18

    mul-long v53, v53, v47

    sub-long v37, v37, v53

    mul-long v18, v39, v33

    add-long v18, v18, v0

    mul-long v0, v39, v12

    add-long/2addr v0, v6

    mul-long v6, v39, v41

    add-long v6, v6, v35

    mul-long v35, v39, v9

    sub-long v31, v31, v35

    mul-long v35, v39, v49

    add-long v35, v35, v16

    mul-long v39, v39, v47

    sub-long v4, v4, v39

    mul-long v16, v45, v33

    add-long v16, v16, v61

    mul-long v39, v45, v12

    add-long v39, v39, v18

    mul-long v18, v45, v41

    add-long v18, v18, v0

    mul-long v0, v45, v9

    sub-long/2addr v6, v0

    mul-long v0, v45, v49

    add-long v0, v0, v31

    mul-long v45, v45, v47

    sub-long v35, v35, v45

    mul-long v31, v29, v33

    add-long v31, v31, v81

    mul-long v45, v29, v12

    add-long v45, v45, v16

    mul-long v16, v29, v41

    add-long v16, v16, v39

    mul-long v39, v29, v9

    sub-long v18, v18, v39

    mul-long v39, v29, v49

    add-long v39, v39, v6

    mul-long v29, v29, v47

    sub-long v0, v0, v29

    add-long v6, v31, v2

    const/16 v8, 0x15

    shr-long/2addr v6, v8

    add-long v45, v45, v6

    shl-long/2addr v6, v8

    sub-long v31, v31, v6

    add-long v6, v16, v2

    shr-long/2addr v6, v8

    add-long v18, v18, v6

    shl-long/2addr v6, v8

    sub-long v16, v16, v6

    add-long v6, v39, v2

    shr-long/2addr v6, v8

    add-long/2addr v0, v6

    shl-long/2addr v6, v8

    sub-long v39, v39, v6

    add-long v6, v35, v2

    shr-long/2addr v6, v8

    add-long/2addr v4, v6

    shl-long/2addr v6, v8

    sub-long v35, v35, v6

    add-long v6, v37, v2

    shr-long/2addr v6, v8

    add-long v24, v24, v6

    shl-long/2addr v6, v8

    sub-long v37, v37, v6

    add-long v6, v55, v2

    shr-long/2addr v6, v8

    add-long v43, v43, v6

    shl-long/2addr v6, v8

    sub-long v55, v55, v6

    add-long v6, v45, v2

    shr-long/2addr v6, v8

    add-long v16, v16, v6

    shl-long/2addr v6, v8

    sub-long v45, v45, v6

    add-long v6, v18, v2

    shr-long/2addr v6, v8

    add-long v39, v39, v6

    shl-long/2addr v6, v8

    sub-long v18, v18, v6

    add-long v6, v0, v2

    shr-long/2addr v6, v8

    add-long v35, v35, v6

    shl-long/2addr v6, v8

    sub-long/2addr v0, v6

    add-long v6, v4, v2

    shr-long/2addr v6, v8

    add-long v37, v37, v6

    shl-long/2addr v6, v8

    sub-long/2addr v4, v6

    add-long v6, v24, v2

    shr-long/2addr v6, v8

    add-long v55, v55, v6

    shl-long/2addr v6, v8

    sub-long v24, v24, v6

    add-long v2, v43, v2

    shr-long/2addr v2, v8

    shl-long v6, v2, v8

    sub-long v43, v43, v6

    mul-long v6, v2, v33

    add-long v6, v6, v31

    mul-long v29, v2, v12

    add-long v29, v29, v45

    mul-long v31, v2, v41

    add-long v31, v31, v16

    mul-long v16, v2, v9

    sub-long v18, v18, v16

    mul-long v16, v2, v49

    add-long v16, v16, v39

    mul-long v2, v2, v47

    sub-long/2addr v0, v2

    const/16 v2, 0x15

    shr-long v39, v6, v2

    add-long v29, v29, v39

    shl-long v39, v39, v2

    sub-long v6, v6, v39

    shr-long v39, v29, v2

    add-long v31, v31, v39

    shl-long v39, v39, v2

    sub-long v29, v29, v39

    shr-long v39, v31, v2

    add-long v18, v18, v39

    shl-long v39, v39, v2

    sub-long v31, v31, v39

    shr-long v39, v18, v2

    add-long v16, v16, v39

    shl-long v39, v39, v2

    sub-long v18, v18, v39

    shr-long v39, v16, v2

    add-long v0, v0, v39

    shl-long v39, v39, v2

    sub-long v16, v16, v39

    shr-long v39, v0, v2

    add-long v35, v35, v39

    shl-long v39, v39, v2

    sub-long v0, v0, v39

    shr-long v39, v35, v2

    add-long v4, v4, v39

    shl-long v39, v39, v2

    sub-long v35, v35, v39

    shr-long v39, v4, v2

    add-long v37, v37, v39

    shl-long v39, v39, v2

    sub-long v4, v4, v39

    shr-long v39, v37, v2

    add-long v24, v24, v39

    shl-long v39, v39, v2

    sub-long v37, v37, v39

    shr-long v39, v24, v2

    add-long v55, v55, v39

    shl-long v39, v39, v2

    sub-long v24, v24, v39

    shr-long v39, v55, v2

    add-long v43, v43, v39

    shl-long v39, v39, v2

    sub-long v55, v55, v39

    shr-long v39, v43, v2

    shl-long v45, v39, v2

    sub-long v43, v43, v45

    mul-long v33, v33, v39

    add-long v33, v33, v6

    mul-long v12, v12, v39

    add-long v12, v12, v29

    mul-long v41, v41, v39

    add-long v41, v41, v31

    mul-long v9, v9, v39

    sub-long v18, v18, v9

    mul-long v49, v49, v39

    add-long v49, v49, v16

    mul-long v39, v39, v47

    sub-long v0, v0, v39

    const/16 v2, 0x15

    shr-long v6, v33, v2

    add-long/2addr v12, v6

    shl-long/2addr v6, v2

    sub-long v6, v33, v6

    shr-long v8, v12, v2

    add-long v41, v41, v8

    shl-long/2addr v8, v2

    sub-long/2addr v12, v8

    shr-long v8, v41, v2

    add-long v18, v18, v8

    shl-long/2addr v8, v2

    sub-long v41, v41, v8

    shr-long v8, v18, v2

    add-long v49, v49, v8

    shl-long/2addr v8, v2

    sub-long v18, v18, v8

    shr-long v8, v49, v2

    add-long/2addr v0, v8

    shl-long/2addr v8, v2

    sub-long v49, v49, v8

    shr-long v8, v0, v2

    add-long v35, v35, v8

    shl-long/2addr v8, v2

    sub-long/2addr v0, v8

    shr-long v8, v35, v2

    add-long/2addr v4, v8

    shl-long/2addr v8, v2

    sub-long v35, v35, v8

    shr-long v8, v4, v2

    add-long v37, v37, v8

    shl-long/2addr v8, v2

    sub-long/2addr v4, v8

    shr-long v8, v37, v2

    add-long v24, v24, v8

    shl-long/2addr v8, v2

    sub-long v8, v37, v8

    shr-long v10, v24, v2

    add-long v55, v55, v10

    shl-long/2addr v10, v2

    sub-long v24, v24, v10

    shr-long v10, v55, v2

    add-long v43, v43, v10

    shl-long/2addr v10, v2

    sub-long v55, v55, v10

    const/16 v2, 0x20

    new-array v2, v2, [B

    long-to-int v3, v6

    int-to-byte v3, v3

    const/4 v10, 0x0

    aput-byte v3, v2, v10

    const/16 v3, 0x8

    shr-long v10, v6, v3

    long-to-int v3, v10

    int-to-byte v3, v3

    aput-byte v3, v2, v22

    const/16 v3, 0x10

    shr-long/2addr v6, v3

    const/4 v3, 0x5

    shl-long v10, v12, v3

    or-long/2addr v6, v10

    long-to-int v3, v6

    int-to-byte v3, v3

    const/4 v6, 0x2

    aput-byte v3, v2, v6

    shr-long v6, v12, v28

    long-to-int v3, v6

    int-to-byte v3, v3

    aput-byte v3, v2, v28

    const/16 v3, 0xb

    shr-long v6, v12, v3

    long-to-int v3, v6

    int-to-byte v3, v3

    aput-byte v3, v2, v20

    const/16 v3, 0x13

    shr-long v6, v12, v3

    const/4 v3, 0x2

    shl-long v10, v41, v3

    or-long/2addr v6, v10

    long-to-int v3, v6

    int-to-byte v3, v3

    const/4 v6, 0x5

    aput-byte v3, v2, v6

    shr-long v6, v41, v26

    long-to-int v3, v6

    int-to-byte v3, v3

    aput-byte v3, v2, v26

    const/16 v3, 0xe

    shr-long v6, v41, v3

    shl-long v10, v18, v15

    or-long/2addr v6, v10

    long-to-int v3, v6

    int-to-byte v3, v3

    aput-byte v3, v2, v15

    shr-long v6, v18, v22

    long-to-int v3, v6

    int-to-byte v3, v3

    const/16 v6, 0x8

    aput-byte v3, v2, v6

    const/16 v3, 0x9

    shr-long v6, v18, v3

    long-to-int v3, v6

    int-to-byte v3, v3

    const/16 v6, 0x9

    aput-byte v3, v2, v6

    const/16 v3, 0x11

    shr-long v6, v18, v3

    shl-long v10, v49, v20

    or-long/2addr v6, v10

    long-to-int v3, v6

    int-to-byte v3, v3

    const/16 v6, 0xa

    aput-byte v3, v2, v6

    shr-long v6, v49, v20

    long-to-int v3, v6

    int-to-byte v3, v3

    const/16 v6, 0xb

    aput-byte v3, v2, v6

    const/16 v3, 0xc

    shr-long v6, v49, v3

    long-to-int v3, v6

    int-to-byte v3, v3

    const/16 v6, 0xc

    aput-byte v3, v2, v6

    const/16 v3, 0x14

    shr-long v6, v49, v3

    shl-long v10, v0, v22

    or-long/2addr v6, v10

    long-to-int v3, v6

    int-to-byte v3, v3

    const/16 v6, 0xd

    aput-byte v3, v2, v6

    shr-long v6, v0, v15

    long-to-int v3, v6

    int-to-byte v3, v3

    const/16 v6, 0xe

    aput-byte v3, v2, v6

    const/16 v3, 0xf

    shr-long/2addr v0, v3

    shl-long v6, v35, v26

    or-long/2addr v0, v6

    long-to-int v1, v0

    int-to-byte v0, v1

    aput-byte v0, v2, v3

    const/4 v0, 0x2

    shr-long v6, v35, v0

    long-to-int v0, v6

    int-to-byte v0, v0

    const/16 v1, 0x10

    aput-byte v0, v2, v1

    const/16 v0, 0xa

    shr-long v0, v35, v0

    long-to-int v1, v0

    int-to-byte v0, v1

    const/16 v1, 0x11

    aput-byte v0, v2, v1

    const/16 v0, 0x12

    shr-long v6, v35, v0

    shl-long v10, v4, v28

    or-long/2addr v6, v10

    long-to-int v1, v6

    int-to-byte v1, v1

    aput-byte v1, v2, v0

    const/4 v0, 0x5

    shr-long v6, v4, v0

    long-to-int v0, v6

    int-to-byte v0, v0

    const/16 v1, 0x13

    aput-byte v0, v2, v1

    const/16 v0, 0xd

    shr-long v0, v4, v0

    long-to-int v1, v0

    int-to-byte v0, v1

    const/16 v1, 0x14

    aput-byte v0, v2, v1

    long-to-int v0, v8

    int-to-byte v0, v0

    const/16 v1, 0x15

    aput-byte v0, v2, v1

    const/16 v0, 0x8

    shr-long v0, v8, v0

    long-to-int v1, v0

    int-to-byte v0, v1

    const/16 v1, 0x16

    aput-byte v0, v2, v1

    const/16 v0, 0x10

    shr-long v0, v8, v0

    const/4 v3, 0x5

    shl-long v3, v24, v3

    or-long/2addr v0, v3

    long-to-int v1, v0

    int-to-byte v0, v1

    const/16 v1, 0x17

    aput-byte v0, v2, v1

    shr-long v0, v24, v28

    long-to-int v1, v0

    int-to-byte v0, v1

    const/16 v1, 0x18

    aput-byte v0, v2, v1

    const/16 v0, 0xb

    shr-long v0, v24, v0

    long-to-int v1, v0

    int-to-byte v0, v1

    const/16 v1, 0x19

    aput-byte v0, v2, v1

    const/16 v0, 0x13

    shr-long v0, v24, v0

    const/4 v3, 0x2

    shl-long v3, v55, v3

    or-long/2addr v0, v3

    long-to-int v1, v0

    int-to-byte v0, v1

    const/16 v1, 0x1a

    aput-byte v0, v2, v1

    shr-long v0, v55, v26

    long-to-int v1, v0

    int-to-byte v0, v1

    const/16 v1, 0x1b

    aput-byte v0, v2, v1

    const/16 v0, 0xe

    shr-long v0, v55, v0

    shl-long v3, v43, v15

    or-long/2addr v0, v3

    long-to-int v1, v0

    int-to-byte v0, v1

    const/16 v1, 0x1c

    aput-byte v0, v2, v1

    shr-long v0, v43, v22

    long-to-int v1, v0

    int-to-byte v0, v1

    const/16 v1, 0x1d

    aput-byte v0, v2, v1

    const/16 v0, 0x9

    shr-long v0, v43, v0

    long-to-int v1, v0

    int-to-byte v0, v1

    const/16 v1, 0x1e

    aput-byte v0, v2, v1

    const/16 v0, 0x11

    shr-long v0, v43, v0

    long-to-int v1, v0

    int-to-byte v0, v1

    const/16 v1, 0x1f

    aput-byte v0, v2, v1

    return-object v2
.end method

.method public reduce([B)[B
    .registers 69

    move-object/from16 v0, p1

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_3([BI)I

    move-result v1

    const v2, 0x1fffff

    and-int/2addr v1, v2

    int-to-long v3, v1

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_4([BI)J

    move-result-wide v5

    const/4 v7, 0x5

    shr-long/2addr v5, v7

    const-wide/32 v8, 0x1fffff

    and-long/2addr v5, v8

    invoke-static {v0, v7}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_3([BI)I

    move-result v10

    shr-int/2addr v10, v1

    and-int/2addr v10, v2

    int-to-long v10, v10

    const/4 v12, 0x7

    invoke-static {v0, v12}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_4([BI)J

    move-result-wide v13

    shr-long/2addr v13, v12

    and-long/2addr v13, v8

    const/16 v15, 0xa

    invoke-static {v0, v15}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_4([BI)J

    move-result-wide v16

    const/16 v18, 0x4

    shr-long v16, v16, v18

    and-long v16, v16, v8

    const/16 v15, 0xd

    invoke-static {v0, v15}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_3([BI)I

    move-result v19

    const/16 v20, 0x1

    shr-int/lit8 v19, v19, 0x1

    and-int v15, v19, v2

    move-wide/from16 v21, v13

    int-to-long v12, v15

    const/16 v14, 0xf

    invoke-static {v0, v14}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_4([BI)J

    move-result-wide v23

    const/4 v15, 0x6

    shr-long v23, v23, v15

    and-long v23, v23, v8

    const/16 v14, 0x12

    invoke-static {v0, v14}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_3([BI)I

    move-result v25

    const/16 v26, 0x3

    shr-int/lit8 v25, v25, 0x3

    and-int v14, v25, v2

    int-to-long v8, v14

    const/16 v14, 0x15

    invoke-static {v0, v14}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_3([BI)I

    move-result v25

    and-int v14, v25, v2

    move-wide/from16 v29, v3

    int-to-long v2, v14

    const/16 v4, 0x17

    invoke-static {v0, v4}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_4([BI)J

    move-result-wide v31

    shr-long v31, v31, v7

    const-wide/32 v27, 0x1fffff

    and-long v31, v31, v27

    const/16 v4, 0x1a

    invoke-static {v0, v4}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_3([BI)I

    move-result v4

    shr-int/2addr v4, v1

    const v14, 0x1fffff

    and-int/2addr v4, v14

    move-wide/from16 v33, v2

    int-to-long v1, v4

    const/16 v3, 0x1c

    invoke-static {v0, v3}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_4([BI)J

    move-result-wide v3

    const/16 v19, 0x7

    shr-long v3, v3, v19

    and-long v3, v3, v27

    const/16 v14, 0x1f

    invoke-static {v0, v14}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_4([BI)J

    move-result-wide v35

    shr-long v35, v35, v18

    and-long v35, v35, v27

    const/16 v14, 0x22

    invoke-static {v0, v14}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_3([BI)I

    move-result v14

    shr-int/lit8 v14, v14, 0x1

    const v25, 0x1fffff

    and-int v14, v14, v25

    move-wide/from16 v37, v8

    int-to-long v7, v14

    const/16 v9, 0x24

    invoke-static {v0, v9}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_4([BI)J

    move-result-wide v39

    shr-long v39, v39, v15

    and-long v39, v39, v27

    const/16 v9, 0x27

    invoke-static {v0, v9}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_3([BI)I

    move-result v9

    shr-int/lit8 v9, v9, 0x3

    and-int v9, v9, v25

    move-wide/from16 v41, v5

    int-to-long v5, v9

    const/16 v9, 0x2a

    invoke-static {v0, v9}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_3([BI)I

    move-result v9

    and-int v9, v9, v25

    move-wide/from16 v43, v10

    int-to-long v9, v9

    const/16 v11, 0x2c

    invoke-static {v0, v11}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_4([BI)J

    move-result-wide v45

    const/4 v11, 0x5

    shr-long v45, v45, v11

    const-wide/32 v27, 0x1fffff

    and-long v45, v45, v27

    const/16 v11, 0x2f

    invoke-static {v0, v11}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_3([BI)I

    move-result v11

    const/4 v14, 0x2

    shr-int/2addr v11, v14

    and-int v11, v11, v25

    int-to-long v14, v11

    const/16 v11, 0x31

    invoke-static {v0, v11}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_4([BI)J

    move-result-wide v47

    const/4 v11, 0x7

    shr-long v47, v47, v11

    and-long v47, v47, v27

    const/16 v11, 0x34

    invoke-static {v0, v11}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_4([BI)J

    move-result-wide v49

    shr-long v49, v49, v18

    and-long v49, v49, v27

    const/16 v11, 0x37

    invoke-static {v0, v11}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_3([BI)I

    move-result v11

    shr-int/lit8 v11, v11, 0x1

    const v25, 0x1fffff

    and-int v11, v11, v25

    move-wide/from16 v51, v12

    int-to-long v11, v11

    const/16 v13, 0x39

    invoke-static {v0, v13}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_4([BI)J

    move-result-wide v53

    const/4 v13, 0x6

    shr-long v53, v53, v13

    and-long v27, v53, v27

    const/16 v13, 0x3c

    invoke-static {v0, v13}, Lnet/i2p/crypto/eddsa/math/ed25519/Ed25519LittleEndianEncoding;->load_4([BI)J

    move-result-wide v53

    shr-long v53, v53, v26

    const-wide/32 v55, 0xa2c13

    mul-long v57, v53, v55

    add-long v57, v57, v3

    const-wide/32 v3, 0x72d18

    mul-long v59, v53, v3

    add-long v59, v59, v35

    const-wide/32 v35, 0x9fb67

    mul-long v61, v53, v35

    add-long v61, v61, v7

    const-wide/32 v7, 0xf39ad

    mul-long v63, v53, v7

    sub-long v39, v39, v63

    const-wide/32 v63, 0x215d1

    mul-long v65, v53, v63

    add-long v65, v65, v5

    const-wide/32 v5, 0xa6f7d

    mul-long v53, v53, v5

    sub-long v9, v9, v53

    mul-long v53, v27, v55

    add-long v53, v53, v1

    mul-long v0, v27, v3

    add-long v0, v0, v57

    mul-long v57, v27, v35

    add-long v57, v57, v59

    mul-long v59, v27, v7

    sub-long v61, v61, v59

    mul-long v59, v27, v63

    add-long v59, v59, v39

    mul-long v27, v27, v5

    sub-long v65, v65, v27

    mul-long v27, v11, v55

    add-long v27, v27, v31

    mul-long v31, v11, v3

    add-long v31, v31, v53

    mul-long v39, v11, v35

    add-long v39, v39, v0

    mul-long v0, v11, v7

    sub-long v57, v57, v0

    mul-long v0, v11, v63

    add-long v0, v0, v61

    mul-long v11, v11, v5

    sub-long v59, v59, v11

    mul-long v11, v49, v55

    add-long v11, v11, v33

    mul-long v33, v49, v3

    add-long v33, v33, v27

    mul-long v27, v49, v35

    add-long v27, v27, v31

    mul-long v31, v49, v7

    sub-long v39, v39, v31

    mul-long v31, v49, v63

    add-long v31, v31, v57

    mul-long v49, v49, v5

    sub-long v0, v0, v49

    mul-long v49, v47, v55

    add-long v49, v49, v37

    mul-long v37, v47, v3

    add-long v37, v37, v11

    mul-long v11, v47, v35

    add-long v11, v11, v33

    mul-long v33, v47, v7

    sub-long v27, v27, v33

    mul-long v33, v47, v63

    add-long v33, v33, v39

    mul-long v47, v47, v5

    sub-long v31, v31, v47

    mul-long v39, v14, v55

    add-long v39, v39, v23

    mul-long v23, v14, v3

    add-long v23, v23, v49

    mul-long v47, v14, v35

    add-long v47, v47, v37

    mul-long v37, v14, v7

    sub-long v11, v11, v37

    mul-long v37, v14, v63

    add-long v37, v37, v27

    mul-long v14, v14, v5

    sub-long v33, v33, v14

    const-wide/32 v13, 0x100000

    add-long v27, v39, v13

    const/16 v2, 0x15

    shr-long v27, v27, v2

    add-long v23, v23, v27

    shl-long v27, v27, v2

    sub-long v39, v39, v27

    add-long v27, v47, v13

    shr-long v27, v27, v2

    add-long v11, v11, v27

    shl-long v27, v27, v2

    sub-long v47, v47, v27

    add-long v27, v37, v13

    shr-long v27, v27, v2

    add-long v33, v33, v27

    shl-long v27, v27, v2

    sub-long v37, v37, v27

    add-long v27, v31, v13

    shr-long v27, v27, v2

    add-long v0, v0, v27

    shl-long v27, v27, v2

    sub-long v31, v31, v27

    add-long v27, v59, v13

    shr-long v27, v27, v2

    add-long v65, v65, v27

    shl-long v27, v27, v2

    sub-long v59, v59, v27

    add-long v27, v9, v13

    shr-long v27, v27, v2

    add-long v45, v45, v27

    shl-long v27, v27, v2

    sub-long v9, v9, v27

    add-long v27, v23, v13

    shr-long v27, v27, v2

    add-long v47, v47, v27

    shl-long v27, v27, v2

    sub-long v23, v23, v27

    add-long v27, v11, v13

    shr-long v27, v27, v2

    add-long v37, v37, v27

    shl-long v27, v27, v2

    sub-long v11, v11, v27

    add-long v27, v33, v13

    shr-long v27, v27, v2

    add-long v31, v31, v27

    shl-long v27, v27, v2

    sub-long v33, v33, v27

    add-long v27, v0, v13

    shr-long v27, v27, v2

    add-long v59, v59, v27

    shl-long v27, v27, v2

    sub-long v0, v0, v27

    add-long v27, v65, v13

    shr-long v27, v27, v2

    add-long v9, v9, v27

    shl-long v27, v27, v2

    sub-long v65, v65, v27

    mul-long v27, v45, v55

    add-long v27, v27, v51

    mul-long v49, v45, v3

    add-long v49, v49, v39

    mul-long v39, v45, v35

    add-long v39, v39, v23

    mul-long v23, v45, v7

    sub-long v47, v47, v23

    mul-long v23, v45, v63

    add-long v23, v23, v11

    mul-long v45, v45, v5

    sub-long v37, v37, v45

    mul-long v11, v9, v55

    add-long v11, v11, v16

    mul-long v15, v9, v3

    add-long v15, v15, v27

    mul-long v27, v9, v35

    add-long v27, v27, v49

    mul-long v45, v9, v7

    sub-long v39, v39, v45

    mul-long v45, v9, v63

    add-long v45, v45, v47

    mul-long v9, v9, v5

    sub-long v23, v23, v9

    mul-long v9, v65, v55

    add-long v9, v9, v21

    mul-long v21, v65, v3

    add-long v21, v21, v11

    mul-long v11, v65, v35

    add-long/2addr v11, v15

    mul-long v15, v65, v7

    sub-long v27, v27, v15

    mul-long v15, v65, v63

    add-long v15, v15, v39

    mul-long v65, v65, v5

    sub-long v45, v45, v65

    mul-long v39, v59, v55

    add-long v39, v39, v43

    mul-long v43, v59, v3

    add-long v43, v43, v9

    mul-long v9, v59, v35

    add-long v9, v9, v21

    mul-long v21, v59, v7

    sub-long v11, v11, v21

    mul-long v21, v59, v63

    add-long v21, v21, v27

    mul-long v59, v59, v5

    sub-long v15, v15, v59

    mul-long v27, v0, v55

    add-long v27, v27, v41

    mul-long v41, v0, v3

    add-long v41, v41, v39

    mul-long v39, v0, v35

    add-long v39, v39, v43

    mul-long v43, v0, v7

    sub-long v9, v9, v43

    mul-long v43, v0, v63

    add-long v43, v43, v11

    mul-long v0, v0, v5

    sub-long v21, v21, v0

    mul-long v0, v31, v55

    add-long v0, v0, v29

    mul-long v11, v31, v3

    add-long v11, v11, v27

    mul-long v27, v31, v35

    add-long v27, v27, v41

    mul-long v29, v31, v7

    sub-long v39, v39, v29

    mul-long v29, v31, v63

    add-long v29, v29, v9

    mul-long v31, v31, v5

    sub-long v43, v43, v31

    add-long v9, v0, v13

    const/16 v2, 0x15

    shr-long/2addr v9, v2

    add-long/2addr v11, v9

    shl-long/2addr v9, v2

    sub-long/2addr v0, v9

    add-long v9, v27, v13

    shr-long/2addr v9, v2

    add-long v39, v39, v9

    shl-long/2addr v9, v2

    sub-long v27, v27, v9

    add-long v9, v29, v13

    shr-long/2addr v9, v2

    add-long v43, v43, v9

    shl-long/2addr v9, v2

    sub-long v29, v29, v9

    add-long v9, v21, v13

    shr-long/2addr v9, v2

    add-long/2addr v15, v9

    shl-long/2addr v9, v2

    sub-long v21, v21, v9

    add-long v9, v45, v13

    shr-long/2addr v9, v2

    add-long v23, v23, v9

    shl-long/2addr v9, v2

    sub-long v45, v45, v9

    add-long v9, v37, v13

    shr-long/2addr v9, v2

    add-long v33, v33, v9

    shl-long/2addr v9, v2

    sub-long v37, v37, v9

    add-long v9, v11, v13

    shr-long/2addr v9, v2

    add-long v27, v27, v9

    shl-long/2addr v9, v2

    sub-long/2addr v11, v9

    add-long v9, v39, v13

    shr-long/2addr v9, v2

    add-long v29, v29, v9

    shl-long/2addr v9, v2

    sub-long v39, v39, v9

    add-long v9, v43, v13

    shr-long/2addr v9, v2

    add-long v21, v21, v9

    shl-long/2addr v9, v2

    sub-long v43, v43, v9

    add-long v9, v15, v13

    shr-long/2addr v9, v2

    add-long v45, v45, v9

    shl-long/2addr v9, v2

    sub-long/2addr v15, v9

    add-long v9, v23, v13

    shr-long/2addr v9, v2

    add-long v37, v37, v9

    shl-long/2addr v9, v2

    sub-long v23, v23, v9

    add-long v13, v33, v13

    shr-long v9, v13, v2

    shl-long v13, v9, v2

    sub-long v33, v33, v13

    mul-long v13, v9, v55

    add-long/2addr v13, v0

    mul-long v0, v9, v3

    add-long/2addr v0, v11

    mul-long v11, v9, v35

    add-long v11, v11, v27

    mul-long v27, v9, v7

    sub-long v39, v39, v27

    mul-long v27, v9, v63

    add-long v27, v27, v29

    mul-long v9, v9, v5

    sub-long v43, v43, v9

    const/16 v2, 0x15

    shr-long v9, v13, v2

    add-long/2addr v0, v9

    shl-long/2addr v9, v2

    sub-long/2addr v13, v9

    shr-long v9, v0, v2

    add-long/2addr v11, v9

    shl-long/2addr v9, v2

    sub-long/2addr v0, v9

    shr-long v9, v11, v2

    add-long v39, v39, v9

    shl-long/2addr v9, v2

    sub-long/2addr v11, v9

    shr-long v9, v39, v2

    add-long v27, v27, v9

    shl-long/2addr v9, v2

    sub-long v39, v39, v9

    shr-long v9, v27, v2

    add-long v43, v43, v9

    shl-long/2addr v9, v2

    sub-long v27, v27, v9

    shr-long v9, v43, v2

    add-long v21, v21, v9

    shl-long/2addr v9, v2

    sub-long v43, v43, v9

    shr-long v9, v21, v2

    add-long/2addr v15, v9

    shl-long/2addr v9, v2

    sub-long v21, v21, v9

    shr-long v9, v15, v2

    add-long v45, v45, v9

    shl-long/2addr v9, v2

    sub-long/2addr v15, v9

    shr-long v9, v45, v2

    add-long v23, v23, v9

    shl-long/2addr v9, v2

    sub-long v45, v45, v9

    shr-long v9, v23, v2

    add-long v37, v37, v9

    shl-long/2addr v9, v2

    sub-long v23, v23, v9

    shr-long v9, v37, v2

    add-long v33, v33, v9

    shl-long/2addr v9, v2

    sub-long v37, v37, v9

    shr-long v9, v33, v2

    shl-long v29, v9, v2

    sub-long v33, v33, v29

    mul-long v55, v55, v9

    add-long v55, v55, v13

    mul-long v3, v3, v9

    add-long/2addr v3, v0

    mul-long v35, v35, v9

    add-long v35, v35, v11

    mul-long v7, v7, v9

    sub-long v39, v39, v7

    mul-long v63, v63, v9

    add-long v63, v63, v27

    mul-long v9, v9, v5

    sub-long v43, v43, v9

    const/16 v0, 0x15

    shr-long v1, v55, v0

    add-long/2addr v3, v1

    shl-long/2addr v1, v0

    sub-long v1, v55, v1

    shr-long v5, v3, v0

    add-long v35, v35, v5

    shl-long/2addr v5, v0

    sub-long/2addr v3, v5

    shr-long v5, v35, v0

    add-long v39, v39, v5

    shl-long/2addr v5, v0

    sub-long v35, v35, v5

    shr-long v5, v39, v0

    add-long v63, v63, v5

    shl-long/2addr v5, v0

    sub-long v39, v39, v5

    shr-long v5, v63, v0

    add-long v43, v43, v5

    shl-long/2addr v5, v0

    sub-long v63, v63, v5

    shr-long v5, v43, v0

    add-long v21, v21, v5

    shl-long/2addr v5, v0

    sub-long v43, v43, v5

    shr-long v5, v21, v0

    add-long/2addr v15, v5

    shl-long/2addr v5, v0

    sub-long v21, v21, v5

    shr-long v5, v15, v0

    add-long v45, v45, v5

    shl-long/2addr v5, v0

    sub-long/2addr v15, v5

    shr-long v5, v45, v0

    add-long v23, v23, v5

    shl-long/2addr v5, v0

    sub-long v5, v45, v5

    shr-long v7, v23, v0

    add-long v37, v37, v7

    shl-long/2addr v7, v0

    sub-long v23, v23, v7

    shr-long v7, v37, v0

    add-long v33, v33, v7

    shl-long/2addr v7, v0

    sub-long v37, v37, v7

    const/16 v0, 0x20

    new-array v0, v0, [B

    long-to-int v7, v1

    int-to-byte v7, v7

    const/4 v8, 0x0

    aput-byte v7, v0, v8

    const/16 v7, 0x8

    shr-long v8, v1, v7

    long-to-int v9, v8

    int-to-byte v8, v9

    aput-byte v8, v0, v20

    const/16 v8, 0x10

    shr-long/2addr v1, v8

    const/4 v8, 0x5

    shl-long v9, v3, v8

    or-long/2addr v1, v9

    long-to-int v2, v1

    int-to-byte v1, v2

    const/4 v2, 0x2

    aput-byte v1, v0, v2

    shr-long v1, v3, v26

    long-to-int v2, v1

    int-to-byte v1, v2

    aput-byte v1, v0, v26

    const/16 v1, 0xb

    shr-long v1, v3, v1

    long-to-int v2, v1

    int-to-byte v1, v2

    aput-byte v1, v0, v18

    const/16 v1, 0x13

    shr-long v1, v3, v1

    const/4 v3, 0x2

    shl-long v8, v35, v3

    or-long/2addr v1, v8

    long-to-int v2, v1

    int-to-byte v1, v2

    const/4 v2, 0x5

    aput-byte v1, v0, v2

    const/4 v1, 0x6

    shr-long v2, v35, v1

    long-to-int v3, v2

    int-to-byte v2, v3

    aput-byte v2, v0, v1

    const/16 v1, 0xe

    shr-long v1, v35, v1

    const/4 v3, 0x7

    shl-long v8, v39, v3

    or-long/2addr v1, v8

    long-to-int v2, v1

    int-to-byte v1, v2

    aput-byte v1, v0, v3

    shr-long v1, v39, v20

    long-to-int v2, v1

    int-to-byte v1, v2

    aput-byte v1, v0, v7

    const/16 v1, 0x9

    shr-long v1, v39, v1

    long-to-int v2, v1

    int-to-byte v1, v2

    const/16 v2, 0x9

    aput-byte v1, v0, v2

    const/16 v1, 0x11

    shr-long v1, v39, v1

    shl-long v3, v63, v18

    or-long/2addr v1, v3

    long-to-int v2, v1

    int-to-byte v1, v2

    const/16 v2, 0xa

    aput-byte v1, v0, v2

    shr-long v1, v63, v18

    long-to-int v2, v1

    int-to-byte v1, v2

    const/16 v2, 0xb

    aput-byte v1, v0, v2

    const/16 v1, 0xc

    shr-long v1, v63, v1

    long-to-int v2, v1

    int-to-byte v1, v2

    const/16 v2, 0xc

    aput-byte v1, v0, v2

    const/16 v1, 0x14

    shr-long v1, v63, v1

    shl-long v3, v43, v20

    or-long/2addr v1, v3

    long-to-int v2, v1

    int-to-byte v1, v2

    const/16 v2, 0xd

    aput-byte v1, v0, v2

    const/4 v1, 0x7

    shr-long v2, v43, v1

    long-to-int v1, v2

    int-to-byte v1, v1

    const/16 v2, 0xe

    aput-byte v1, v0, v2

    const/16 v1, 0xf

    shr-long v2, v43, v1

    const/4 v4, 0x6

    shl-long v8, v21, v4

    or-long/2addr v2, v8

    long-to-int v3, v2

    int-to-byte v2, v3

    aput-byte v2, v0, v1

    const/4 v1, 0x2

    shr-long v2, v21, v1

    long-to-int v1, v2

    int-to-byte v1, v1

    const/16 v2, 0x10

    aput-byte v1, v0, v2

    const/16 v1, 0xa

    shr-long v1, v21, v1

    long-to-int v2, v1

    int-to-byte v1, v2

    const/16 v2, 0x11

    aput-byte v1, v0, v2

    const/16 v1, 0x12

    shr-long v2, v21, v1

    shl-long v8, v15, v26

    or-long/2addr v2, v8

    long-to-int v3, v2

    int-to-byte v2, v3

    aput-byte v2, v0, v1

    const/4 v1, 0x5

    shr-long v2, v15, v1

    long-to-int v1, v2

    int-to-byte v1, v1

    const/16 v2, 0x13

    aput-byte v1, v0, v2

    const/16 v1, 0xd

    shr-long v1, v15, v1

    long-to-int v2, v1

    int-to-byte v1, v2

    const/16 v2, 0x14

    aput-byte v1, v0, v2

    long-to-int v1, v5

    int-to-byte v1, v1

    const/16 v2, 0x15

    aput-byte v1, v0, v2

    shr-long v1, v5, v7

    long-to-int v2, v1

    int-to-byte v1, v2

    const/16 v2, 0x16

    aput-byte v1, v0, v2

    const/16 v1, 0x10

    shr-long v1, v5, v1

    const/4 v3, 0x5

    shl-long v3, v23, v3

    or-long/2addr v1, v3

    long-to-int v2, v1

    int-to-byte v1, v2

    const/16 v2, 0x17

    aput-byte v1, v0, v2

    shr-long v1, v23, v26

    long-to-int v2, v1

    int-to-byte v1, v2

    const/16 v2, 0x18

    aput-byte v1, v0, v2

    const/16 v1, 0xb

    shr-long v1, v23, v1

    long-to-int v2, v1

    int-to-byte v1, v2

    const/16 v2, 0x19

    aput-byte v1, v0, v2

    const/16 v1, 0x13

    shr-long v1, v23, v1

    const/4 v3, 0x2

    shl-long v3, v37, v3

    or-long/2addr v1, v3

    long-to-int v2, v1

    int-to-byte v1, v2

    const/16 v2, 0x1a

    aput-byte v1, v0, v2

    const/4 v1, 0x6

    shr-long v1, v37, v1

    long-to-int v2, v1

    int-to-byte v1, v2

    const/16 v2, 0x1b

    aput-byte v1, v0, v2

    const/16 v1, 0xe

    shr-long v1, v37, v1

    const/4 v3, 0x7

    shl-long v3, v33, v3

    or-long/2addr v1, v3

    long-to-int v2, v1

    int-to-byte v1, v2

    const/16 v2, 0x1c

    aput-byte v1, v0, v2

    shr-long v1, v33, v20

    long-to-int v2, v1

    int-to-byte v1, v2

    const/16 v2, 0x1d

    aput-byte v1, v0, v2

    const/16 v1, 0x9

    shr-long v1, v33, v1

    long-to-int v2, v1

    int-to-byte v1, v2

    const/16 v2, 0x1e

    aput-byte v1, v0, v2

    const/16 v1, 0x11

    shr-long v1, v33, v1

    long-to-int v2, v1

    int-to-byte v1, v2

    const/16 v2, 0x1f

    aput-byte v1, v0, v2

    return-object v0
.end method
